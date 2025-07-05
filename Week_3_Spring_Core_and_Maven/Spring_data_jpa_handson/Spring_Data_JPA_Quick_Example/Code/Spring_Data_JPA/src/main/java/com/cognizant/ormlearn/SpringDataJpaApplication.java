package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringDataJpaApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
        OrmLearnApplication ormApp = context.getBean(OrmLearnApplication.class);

        logger.info("Inside main");
        ormApp.testGetAllCountries();
    }
}