package com.hicham.builder;

public class Main {
    public static void main(String[] args) {
        // Exemple 1 : Créer un étudiant avec des attributs obligatoires et quelques attributs optionnels
        Student student1 = new Student.Builder("Hicham", 25)
                .email("hicham@gmail.com")
                .phoneNumber("+212631790457")
                .grade(15.5)
                .build();

        System.out.println(student1);

        // Exemple 2 : Créer un étudiant avec seulement les attributs obligatoires
        Student student2 = new Student.Builder("Amina", 22).build();
        System.out.println(student2);

        // Exemple 3 : Créer un étudiant avec tous les attributs
        Student student3 = new Student.Builder("Said", 28)
                .email("said@example.com")
                .address("Casablanca, Maroc")
                .phoneNumber("+212600000000")
                .gender("Male")
                .grade(18.0)
                .build();
        System.out.println(student3);
    }
}

