package com.example.adamproject.controllers;


import org.springframework.stereotype.Controller;

import com.example.adamproject.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;


@Controller
public class UserController {

    private UserRepository usersDao;
    private PasswordEncoder passwordEncoder;


    public UserController(UserRepository usersDao, PasswordEncoder passwordEncoder){
        this.usersDao = usersDao;
        this.passwordEncoder = passwordEncoder;
    }
}