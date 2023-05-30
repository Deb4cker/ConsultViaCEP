package com.br.challengeviacep.repository;

import com.br.challengeviacep.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
