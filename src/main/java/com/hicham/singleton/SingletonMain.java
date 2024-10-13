package com.hicham.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Les deux objets sont identiques
        System.out.println(connection1 == connection2);
        System.out.println(connection1.equals(connection2));
    }
}
