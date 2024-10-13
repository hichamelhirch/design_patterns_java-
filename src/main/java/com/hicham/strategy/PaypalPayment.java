package com.hicham.strategy;

public class PaypalPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paymement Paypal effectue avec succes ");
    }
}
