package com.hifive.songgame.controller;

import java.util.List;

import com.hifive.songgame.model.User;
import com.hifive.songgame.repository.UserRepository;
import com.hifive.songgame.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


    @RestController
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/api")

    public class UserController {
        
        @Autowired
        private UserRepository userRepository;

        // @Autowired
        // UserService userService;

        @GetMapping("/users")
        public List<User> getUsers() {
            return this.userRepository.findAll();
        }
        
        @PostMapping("/users")
        public void addUsers(@RequestBody User user){
            // userService.addUser(user);
        }
        
    }

