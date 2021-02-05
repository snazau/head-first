package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("1st step - Inheritance");
        System.out.println();

        System.out.println("Duck");
        Duck duck = new Duck();
        duck.quack();
        duck.fly();
        duck.display();
        System.out.println();

        System.out.println("MallardDuck");
        Duck duck_mallard = new MallardDuck();
        duck_mallard.quack();
        duck_mallard.fly();
        duck_mallard.display();
        System.out.println();

        System.out.println("RedheadDuck");
        Duck duck_redhead = new RedheadDuck();
        duck_redhead.quack();
        duck_redhead.fly();
        duck_redhead.display();
        System.out.println();

        System.out.println("RubberDuck");
        Duck duck_rubber = new RubberDuck();
        duck_rubber.quack();
        duck_rubber.fly();
        duck_rubber.display();
        System.out.println();

        System.out.println("DecoyDuck");
        Duck duck_decoy = new DecoyDuck();
        duck_decoy.quack();
        duck_decoy.fly();
        duck_decoy.display();
        System.out.println();
    }
}
