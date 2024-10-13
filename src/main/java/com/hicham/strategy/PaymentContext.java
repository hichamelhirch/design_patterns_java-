package com.hicham.strategy;

public class PaymentContext {
    private PayStrategy strategy;

    public PaymentContext(PayStrategy payStrategy) {
        this.strategy = payStrategy;
    }

    void excutePayment(){
        if (strategy==null){
            System.err.println("mamkhaleseshe akhi siiir kheles shughelek ");
            return;
        }
        strategy.pay();
    }
}
