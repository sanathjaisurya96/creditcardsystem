package com.PITask.creditcardsystem.service;

import com.PITask.creditcardsystem.model.CreditCardDetails;
import com.PITask.creditcardsystem.repository.CreditCardDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreditCardDetailsService {
    @Autowired
    CreditCardDetailsRepository creditCardDetailsRepository;

    public List<CreditCardDetails> getCreditCardDetails()
    {
        List<CreditCardDetails> creditCardDetailsList = creditCardDetailsRepository.findAll();

        return creditCardDetailsList;
    }

    public void insertCreditCardDetails(CreditCardDetails creditCardDetails)
    {
        creditCardDetailsRepository.save(creditCardDetails);

    }
}
