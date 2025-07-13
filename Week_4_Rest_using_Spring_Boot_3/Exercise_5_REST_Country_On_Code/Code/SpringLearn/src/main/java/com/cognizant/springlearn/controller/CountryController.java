package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
    @RequestMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        switch (code.toUpperCase()) {
            case "IN": return (Country) context.getBean("countryIN");
            case "US": return (Country) context.getBean("countryUS");
            case "SA": return (Country) context.getBean("countrySA");
            default:
                return null;
        }
    }

}
