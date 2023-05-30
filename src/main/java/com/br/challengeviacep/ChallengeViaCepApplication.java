package com.br.challengeviacep;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ChallengeViaCepApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ChallengeViaCepApplication.class).headless(false).run(args);
    }
}
