package com.gcu.controllers;


import com.gcu.business.UserBusinessService;
import com.gcu.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for actions related to logging in a user
 */
@Controller
//@RequestMapping("/")
public class LoginController {

    @Autowired
    UserBusinessService userService;

    @GetMapping("/login")
    public String onLogin(Model model){
        //Display Login view
        model.addAttribute("userModel", new UserModel());

        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@ModelAttribute UserModel userModel){

        if(userService.getAuthorizedUser(userModel)){
            //if returns true
            return "products";
        } else {
            //if returns false
            return "index";
        }

    }
}
