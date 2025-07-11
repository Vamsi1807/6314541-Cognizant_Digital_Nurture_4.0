package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBeansApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringBeansApplication.class);

    public static void main(String[] args) {
        displayCountry();
    }

    static void displayCountry(){

        System.out.println("Inside displayCountry method");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country", Country.class);
        logger.info("Country : {}", country.toString());
    }
}
