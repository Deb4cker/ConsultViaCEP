package com.br.challengeviacep.controller;

import com.br.challengeviacep.entity.User;
import com.br.challengeviacep.service.PostalCodeService;
import com.br.challengeviacep.service.UserService;
import com.br.challengeviacep.view.LoginView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor()
public class LoginController {

    private static final LoginView view = new LoginView();
    private UserService service;

    private void initButtons(){
        view.addActionBtEntrar(e -> enter());
    }

    public void showView(){
        initButtons();
        view.showView();
    }
    private void enter(){
        view.setLbWrongInput(false);

        if(isValidUser(view.getEmailInput(), view.getPasswordInput())){
            new SearchController(new PostalCodeService()).showView();
        }
        else {view.setLbWrongInput(true);}
    }

    private boolean isValidUser(String email, String password){
        return service.isValidUser(email, password);
    }

}
