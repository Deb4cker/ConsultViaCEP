package com.br.challengeviacep.controller;

import com.br.challengeviacep.entity.PostalCode;
import com.br.challengeviacep.entity.ErrorResponse;
import com.br.challengeviacep.service.PostalCodeService;
import com.br.challengeviacep.view.SearchView;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class SearchController {

    private PostalCodeService service;
    private static final SearchView view = new SearchView();

    public void showView (){
        initButtons();
        view.showView();
    }

    public void initButtons(){
        view.addActionbtSearch(e -> search());
    }

    private void search(){
        setLabels();

        PostalCode postalCode = service.findPostalCode(view.getInputValue());
        try {
            if (postalCode instanceof ErrorResponse) {
                view.setNotFound(true);
            } else {
                if(postalCode.getLogradouro().isBlank()){
                    view.setUniqueCep(true);
                    setUniqueCEPLocation(postalCode);
                }
                else
                    setCompleteCEPLocation(postalCode);
            }
        }
        catch (NullPointerException e){
            view.setinvalidInput(true);
        }
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
        view.setUniqueCep(false);
        view.setinvalidInput(false);
        view.setNotFound(false);
    }
}
