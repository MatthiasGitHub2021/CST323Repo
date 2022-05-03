package com.gcu.controllers;

import com.gcu.business.UserBusinessService;
import com.gcu.model.UserModel;
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
//@RequestMapping("/")
public class UserController {
    //Dependency Inject
    @Autowired
    UserBusinessService service;

    /**
     * Returns page for registering a user
     */
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("title", "Register");
        model.addAttribute("userModel", new UserModel());
        //System.out.println("test");
        return "register";
    }

    /**
     * Registers user in database
     */
    @PostMapping("/doRegister")
    public String doRegister(@ModelAttribute UserModel userModel, Model model){

        //System.out.println("UName =" + userModel.getUserName());
        //get userService and add new user
        service.addUser(userModel);
        //System.out.println("test doRegister");
        return "login";
    }
}






















