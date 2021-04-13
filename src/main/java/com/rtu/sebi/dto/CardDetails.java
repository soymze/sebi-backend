package com.rtu.sebi.dto;

import java.io.Serializable;

public class CardDetails implements Serializable {

    private String name;
    private String surname;
    private String cardNumber;
    private String customerNumber;

    public CardDetails(String name, String surname, String cardNumber, String customerNumber) {
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }
}
