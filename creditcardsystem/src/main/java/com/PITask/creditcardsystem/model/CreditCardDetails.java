package com.PITask.creditcardsystem.model;

import com.PITask.creditcardsystem.validator.CardNumberConstraint;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "credit_card_details")
public class CreditCardDetails {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotEmpty(message = "name cannot be empty.")
    @Size(min = 5, max = 250)
    private String fullName;
    @Column
    @CardNumberConstraint
    @NotEmpty(message = "Card Number cannot be empty.")
    @Size(min = 5, max = 19)
    private String cardNumber;
    @Column
    private long creditLimit = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

}
