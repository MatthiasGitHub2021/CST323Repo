package com.gcu.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringLoggingHelper {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void helpMethod(){
        logger.debug("Logger debug message.");
        logger.info("Logger info message");
        logger.warn("Logger warn message");
        logger.error("Logger error message.");
        
    }
}
