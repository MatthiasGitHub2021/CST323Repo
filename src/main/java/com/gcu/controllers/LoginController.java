package com.gcu.controllers;

import com.gcu.business.ProductBusinessService;
import com.gcu.business.UserBusinessService;
import com.gcu.model.ProductModel;
import com.gcu.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Controller for actions related to logging in a user
 */
@Controller
//@RequestMapping("/")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserBusinessService userService;

    @Autowired
    private ProductBusinessService service;

    @GetMapping("/login")
    public String onLogin(Model model){
        //Display Login view
        model.addAttribute("userModel", new UserModel());
        logger.info("Login page accessed.");
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@ModelAttribute ProductModel productModel, UserModel userModel, Model model){

        if(userService.getAuthorizedUser(userModel)){
            //if returns true
            logger.info("Login successful with user: " + userModel.getUsername());

            //Get list from database
            List<ProductModel> productList = service.getAllProducts();

            //Tells model to pass in retrieved list
            model.addAttribute("title", "Products");
            model.addAttribute("ProductList", productList);
            return "products";
        } else {
            //if returns false
            logger.info("Login failed with username: " + userModel.getUsername() + " password: " + userModel.getPassword());
            return "index";
        }

    }
}
