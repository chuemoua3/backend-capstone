package com.hifive.songgame.repository;

import com.hifive.songgame.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}