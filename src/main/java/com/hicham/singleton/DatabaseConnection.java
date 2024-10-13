package com.hicham.singleton;

public class DatabaseConnection {
    // Instance unique
    private static DatabaseConnection instance;

    // Constructeur privé pour empêcher l'instanciation directe
    private DatabaseConnection() {
        System.out.println("Connexion à la base de données...");
    }

    // Méthode pour obtenir l'instance unique
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

