package com.br.challengeviacep.service;

import com.br.challengeviacep.exception.UserNotFoundException;
import com.br.challengeviacep.entity.User;
import com.br.challengeviacep.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private User findUserByEmail(String email){
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElseThrow(UserNotFoundException::new);
    }

    public boolean isValidUser(String email, String password){
        User user = findUserByEmail(email);
        return user.getPassword().equals(password);
    }
}
