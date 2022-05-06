package com.gcu.controllers;

import com.gcu.business.ProductBusinessService;
import com.gcu.entity.ProductEntity;
import com.gcu.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        model.addAttribute("ProductList", productList);
//        for (ProductModel product : productList) {
//            System.out.println(product.getName() + "");
//        }
        return "products";
    }

    /**
     * Returns page to add a product
     * @param model
     * @return addProduct.html
     */
    @GetMapping("/addProduct")
    public String addProduct(Model model){

        model.addAttribute("title", "Add Product");
        model.addAttribute("ProductModel", new ProductModel());
        //         object name to reference^^^              object^^^

        return "addProduct";
    }

    @PostMapping("/doAdd")
    public String doAdd(@ModelAttribute ProductModel productModel, Model model){

        //adds product to database
        service.addProduct(productModel);

        //Get list from database
        List<ProductModel> productList = service.getAllProducts();

        //Tells model to pass in retrieved list
        model.addAttribute("title", "Products");
        model.addAttribute("ProductList", productList);

        return "products";
    }

    /**
     * Return product page with all products
     * @return products.html
     */

    @GetMapping("/deleteById/{id}")
    public String deleteByID(@PathVariable int id, Model model){

        //Get the product entity by ID #
        ProductModel product = service.getProductById(id);

        //Delete from database
        service.deleteProduct(product);

        //Get list from database
        List<ProductModel> productList = service.getAllProducts();

        //Tells model to pass in retrieved list
        model.addAttribute("title", "Products");
        model.addAttribute("ProductList", productList);

        return "products";
        //return "redirect:products";
    }

    /**
     * Process update function from products.html
     * @param id
     * @return updateProduct.html
     */
    @GetMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable int id, Model model){

        //Get the product entity by ID #
        ProductModel product = service.getProductById(id);

        //Populate a model object from entity id
        model.addAttribute("ProductModel", product);

        return "updateProduct";
    }

}
