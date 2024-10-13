package com.hicham.proxy;

public class Client {
    private IMetier metier=new Proxy();
public Client(){
    System.out.println(metier.calcul());
}
    public static void main(String[] args) {
      new Client();
    }

}
