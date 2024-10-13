package com.hicham.proxy;

public class Proxy implements IMetier{
    private MetierImpl metier;
    private double resp;
    @Override
    public double calcul() {
        if (metier==null) metier=new MetierImpl();
        System.out.println("Ouverture d'une transaction");
        try {
            resp=metier.calcul();
            System.out.println("Commit");
        }catch (Exception exception){
            System.out.println("Rollback");
            throw(exception);
        }
        return resp;
    }
}
