package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String onLogin(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
