package com.PITask.creditcardsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "credit_card_details")
public class CreditCardDetails {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
    @Column
    private String cardNumber;
    @Column
    private long creditLimit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
