package com.company;

import com.company.Animal;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("bbooooooooooooooo");

    }

    @Override
    public void movement() {
        System.out.println("backwards");
        setAge(9);
        setName("po");
        setWeight(8888888);
    }
}
