package com.br.challengeviacep.controller;

import com.br.challengeviacep.entity.PostalCode;
import com.br.challengeviacep.entity.ErrorResponse;
import com.br.challengeviacep.service.PostalCodeService;
import com.br.challengeviacep.view.SearchView;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
@EnableCaching
public class SearchController {

    private PostalCodeService service;
    private static final SearchView view = new SearchView();

    public void showView (){
        initButtons();
        view.showView();
    }

    public void initButtons(){
        view.addActionbtSearch(e -> search(view.getInputValue()));
    }



    public void search(String cep){
        setLabels();
        cep = cep.replace("-", "");
        if(isValidCep(cep)) {

            long init = System.currentTimeMillis();
            PostalCode postalCode = service.findPostalCode(cep);
            long finish = System.currentTimeMillis();

            view.setLbResponseTime(finish - init);
            if (postalCode instanceof ErrorResponse) {
                view.setNotFound(true);
            } else {
                if (isUniqueCep(postalCode)) {
                    view.setUniqueCep(true);
                    setUniqueCEPLocation(postalCode);
                } else
                    setCompleteCEPLocation(postalCode);
            }
        }
        else{view.setinvalidInput(true);}
    }


    private void setUniqueCEPLocation(PostalCode postalCode){
        view.setLbCep(postalCode.getCep());
        view.setLbLocation(postalCode.getLocalidade());
        view.setLbDDD(postalCode.getDdd());
        view.setLbUf(postalCode.getUf());
        view.setLbIBGE(postalCode.getIbge());
        view.setLbSIAFI(postalCode.getSiafi());
    }

    private void setCompleteCEPLocation(PostalCode postalCode){
        setUniqueCEPLocation(postalCode);
        view.setLbLogradouro(postalCode.getLogradouro());
        view.setLbBairro(postalCode.getBairro());
        view.setLbComplemento(postalCode.getComplemento());
        view.setLbGIA(postalCode.getGia());
    }

    private void setLabels(){
        view.resetResultLabels();
        view.setUniqueCep(false);
        view.setinvalidInput(false);
        view.setNotFound(false);
    }

    private boolean isValidCep(String cep){

        return cep.matches("[+-]?\\d*(\\.\\d+)?") && cep.length() == 8;
    }

    private boolean isUniqueCep(PostalCode postalCode){
        return postalCode.getLogradouro().isBlank();
    }
}
