package com.gcu.controllers;


import com.gcu.business.ProductBusinessService;
import com.gcu.business.UserBusinessService;
import com.gcu.logs.Logging;
import com.gcu.model.ProductModel;
import com.gcu.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Controller for actions related to logging in a user
 */
@Controller
//@RequestMapping("/")
public class LoginController {

    @Autowired
    UserBusinessService userService;

    @Autowired
    private ProductBusinessService service;

    @GetMapping("/login")
    public String onLogin(Model model){
        //Display Login view
        model.addAttribute("userModel", new UserModel());

//        Logging.getTimeStamp();
//        Logging.getCurrentClassAndMethodName();

        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@ModelAttribute ProductModel productModel, UserModel userModel, Model model){

        if(userService.getAuthorizedUser(userModel)){
            //if returns true

            //Get list from database
            List<ProductModel> productList = service.getAllProducts();

            //Tells model to pass in retrieved list
            model.addAttribute("title", "Products");
            model.addAttribute("ProductList", productList);
            return "products";
        } else {
            //if returns false
            return "index";
        }

    }
}
