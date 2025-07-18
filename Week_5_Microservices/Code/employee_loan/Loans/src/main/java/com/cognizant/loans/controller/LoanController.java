package com.cognizant.loans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Map<String, String> getLoan(@PathVariable("number") String number){
        Map<String, String> loanData = new HashMap<>();
        loanData.put("number", number);
        loanData.put("type", "car");
        loanData.put("loan", "400000");
        loanData.put("tenure", "18");

        System.out.println("Request from account number : " + number);
        System.out.println("It's details are (dummy) : " + loanData);

        return loanData;
    }
}
