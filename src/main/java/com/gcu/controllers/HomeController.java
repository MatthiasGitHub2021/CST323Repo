package com.gcu.controllers;

import com.gcu.logs.Logging;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for actions related to home/index page
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){

//        Logging.getTimeStamp();
//        Logging.getCurrentClassAndMethodName();

        return "index";
    }

}
