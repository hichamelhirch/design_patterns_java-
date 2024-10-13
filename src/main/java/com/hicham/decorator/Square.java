package com.hicham.decorator;

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Dessiner un carré");
    }
}

