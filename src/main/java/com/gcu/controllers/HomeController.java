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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    public String index(){
        logger.debug("Logger debug message.");
        logger.info("Logger info message");
        logger.warn("Logger warn message");
        logger.error("Logger error message.");
        new SpringLoggingHelper().helpMethod();
        return "index";
    }

}
