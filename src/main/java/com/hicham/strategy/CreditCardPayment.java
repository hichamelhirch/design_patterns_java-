package com.hicham.strategy;

public class CreditCardPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Payment credit card effectue avec succces");
    }
}
