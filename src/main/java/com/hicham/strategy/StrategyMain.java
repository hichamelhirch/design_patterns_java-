package com.hicham.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        PaymentContext context=new PaymentContext(new PaypalPayment());
        context.excutePayment();
    }
}
