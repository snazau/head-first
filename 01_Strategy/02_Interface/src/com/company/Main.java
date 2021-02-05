package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("2nd step - Interface");
        System.out.println();

        System.out.println("Duck");
        Duck duck = new Duck();
        duck.display();
        System.out.println();

        System.out.println("MallardDuck");
        MallardDuck duck_mallard = new MallardDuck();
        duck_mallard.quack();
        duck_mallard.fly();
        duck_mallard.display();
        System.out.println();

        System.out.println("RedheadDuck");
        RedheadDuck duck_redhead = new RedheadDuck();
        duck_redhead.quack();
        duck_redhead.fly();
        duck_redhead.display();
        System.out.println();

        System.out.println("RubberDuck");
        RubberDuck duck_rubber = new RubberDuck();
        duck_rubber.quack();
        duck_rubber.display();
        System.out.println();

        System.out.println("DecoyDuck");
        DecoyDuck duck_decoy = new DecoyDuck();
        duck_decoy.display();
        System.out.println();
    }
}
