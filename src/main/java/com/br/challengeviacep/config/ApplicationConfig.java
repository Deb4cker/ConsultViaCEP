package com.br.challengeviacep.config;

import com.br.challengeviacep.controller.LoginController;
import com.br.challengeviacep.entity.User;
import com.br.challengeviacep.repository.UserRepository;
import com.br.challengeviacep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ApplicationConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        List<User> list = new ArrayList<>();
        list.add(new User(null, "admin@admin1", "123"));
        list.add(new User(null, "admin@admin2", "234"));

        userRepository.saveAll(list);

        new LoginController(new UserService(userRepository)).showView();
    }
}
