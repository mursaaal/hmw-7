package com.company;

import com.company.Animal;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("mmmmmmm");

    }

    @Override
    public void movement() {
        System.out.println("forward");

    }

}
