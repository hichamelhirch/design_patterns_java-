package com.hicham.singleton;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton instance=new EagerInitializationSingleton();
    private EagerInitializationSingleton(){
    }
    public static EagerInitializationSingleton getInstance(){
        System.out.println("Eager init for the class");
        return instance;
    }
}
