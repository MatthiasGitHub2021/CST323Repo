package com.gcu.controllers;

import com.gcu.logs.SpringLoggingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for actions related to home/index page
 */
@Controller
public class HomeController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    public String index(){

//      logger.info("HomeController accessed." + getClass());
        logger.info("HomeController accessed.");
//        new SpringLoggingHelper().helpMethod();
        return "index";
    }

}
