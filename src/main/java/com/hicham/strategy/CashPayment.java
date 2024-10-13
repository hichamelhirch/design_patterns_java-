package com.hicham.strategy;

public class CashPayment implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("Cash payment effectue avec succces ");
    }
}
