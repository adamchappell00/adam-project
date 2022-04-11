package com.example.adamproject.controllers;

import com.example.adamproject.repositories.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserRepository usersDao;

    public UserController(UserRepository usersDao){
        this.usersDao = usersDao;
    }
}