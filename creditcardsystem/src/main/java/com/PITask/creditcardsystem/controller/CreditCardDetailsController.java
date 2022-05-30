package com.PITask.creditcardsystem.controller;

import com.PITask.creditcardsystem.model.CreditCardDetails;
import com.PITask.creditcardsystem.repository.CreditCardDetailsRepository;
import com.PITask.creditcardsystem.service.CreditCardDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/credit-card-details")
public class CreditCardDetailsController {

    @Autowired
    CreditCardDetailsService creditCardDetailsService;

    @GetMapping
    public List<CreditCardDetails> getAllCreditCardDetails() {
        return creditCardDetailsService.getCreditCardDetails();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCreditCardDetails(@RequestBody CreditCardDetails creditCardDetails) {
       creditCardDetailsService.insertCreditCardDetails(creditCardDetails);
    }
}
