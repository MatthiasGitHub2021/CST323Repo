package com.gcu.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for actions related to logging in a user
 */
@Controller
//@RequestMapping("/")
public class LoginController {

    @GetMapping("/login")
    public String display(Model model){
        //Display Login view
        model.addAttribute("title", "Login Form");

        return "login";
    }
}
