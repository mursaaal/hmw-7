package com.company;

public class Main {

    public static void main(String[] args) {
        printInfo();
    }


    private static void printInfo() {
        Cat c = new Cat();
        c.setWeight(89);
        c.setAge(2);
        c.setName("bo");
        System.out.println("name:" + c.getName() + "age; " + c.getAge() + "weight ; " + c.getWeight());
        c.sound();
        c.movement();

        Dog d = new Dog();
        d.setAge(9);
        d.setName("po");
        d.setWeight(8888888);
        System.out.println("name:"+d.getName()+ "age ; " + d.getAge()+ "weight ; " + d.getWeight());
        d.movement();
        d.sound();
    }
}

