package com.gcu.controllers;

import com.gcu.business.ProductBusinessService;
import com.gcu.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Controller for actions related to products
 */
@Controller
//@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductBusinessService service;

    /**
     * Return product page with all products
     * @return products.html
     */
    @GetMapping("/products")
    public String products(Model model){
        //Get product list
        List<ProductModel> productList = service.getAllProducts();
        model.addAttribute("title", "Products");
        model.addAttribute("productList", productList);

        return "products";
    }

    @GetMapping("/addProduct")
    public String addProduct(Model model){

        model.addAttribute("title", "Add Product");

        return "addProduct";
    }

    @PostMapping("/doAdd")
    public String doAdd(@ModelAttribute ProductModel productModel, Model model){
        service.addProduct(productModel);
        return "products";
    }
}
