package com.br.challengeviacep;

import com.br.challengeviacep.controller.LoginController;
import com.br.challengeviacep.repository.UserRepository;
import com.br.challengeviacep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ChallengeViaCepApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ChallengeViaCepApplication.class, args);
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(ChallengeViaCepApplication.class)
                .headless(false).run(args);
    }


}
