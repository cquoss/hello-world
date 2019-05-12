package de.quoss.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * simple hello world example
 * 
 * @author Clemens Quoß
 */
public class HelloWorld {
   
    /**
     * class name
     */
    private static final String CLASS_NAME = HelloWorld.class.getCanonicalName();
    
    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(CLASS_NAME);
    
    public void run() {
        LOGGER.info("Hello, World!");
    }
    
    /**
     * main method
     * 
     * @param args command line arguments 
     */
    public static void main(String[] args) {
        new HelloWorld().run();
    }
    
}
