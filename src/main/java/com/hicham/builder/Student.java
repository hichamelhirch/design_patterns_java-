package com.hicham.builder;

public class Student {
    // Attributs
    private String name;          // obligatoire
    private int age;              // obligatoire
    private String email;         // optionnel
    private String address;       // optionnel
    private String phoneNumber;   // optionnel
    private String gender;        // optionnel
    private double grade;         // optionnel

    // Constructor prive, utilise uniquement par le Builder
    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.gender = builder.gender;
        this.grade = builder.grade;
    }

    // Classe statique interne pour le Builder
    public static class Builder {
        // Attributs obligatoires
        private String name;
        private int age;

        // Attributs optionnels avec des valeurs par defaut
        private String email = "";
        private String address = "";
        private String phoneNumber = "";
        private String gender = "Unknown";
        private double grade = 0.0;

        // Constructeur du Builder avec les parametres obligatoires
        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Methodes pour ajouter des attributs optionnels
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder grade(double grade) {
            this.grade = grade;
            return this;
        }

        // La methode qui retourne l'objet Student final
        public Student build() {
            return new Student(this);
        }
    }


    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                '}';
    }
}
