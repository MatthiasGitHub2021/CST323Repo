package com.gcu.controllers;

import com.gcu.business.UserBusinessService;
import com.gcu.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for actions related to registering a user
 */
@Controller
public class UserController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserBusinessService service;

    /**
     * Returns page for registering a user
     */
    @GetMapping("/register")
    public String register(Model model){
        logger.info("Register page accessed.");
        model.addAttribute("title", "Register");
        model.addAttribute("userModel", new UserModel());
        return "register";
    }

    /**
     * Registers user in database
     */
    @PostMapping("/doRegister")
    public String doRegister(@ModelAttribute UserModel userModel){
        logger.info("New user registered. Username: " + userModel.getUsername());

        //get userService and add new user
        service.addUser(userModel);
        return "login";
    }
}






















