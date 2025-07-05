package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrmLearnApplication {
    private final CountryService countryService;
    private static final Logger logger = LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    public OrmLearnApplication(CountryService countryService) {
        this.countryService = countryService;
    }

    public void testGetAllCountries() {
        logger.info("Start");
        List<Country> countries = countryService.getAllCountries();

        // Improved display
        if (countries.isEmpty()) {
            System.out.println("No countries found in the database");
        } else {
            System.out.println("\nList of Countries:");
            System.out.println("-----------------");
            countries.forEach(country ->
                    System.out.printf("%-5s - %s%n",
                            country.getCode(),
                            country.getName())
            );
            System.out.println();
        }

        logger.debug("countries={}", countries);
        logger.info("End");
    }
}