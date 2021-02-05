package com.company;

import com.company.Behaviors.QuackBehavior.Squeak;
import com.company.Ducks.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("3rd step - Interface");
        System.out.println();

        System.out.println("MallardDuck");
        MallardDuck duck_mallard = new MallardDuck();
        duck_mallard.performQuack();
        duck_mallard.performFly();
        duck_mallard.display();
        duck_mallard.swim();
        System.out.println();

        System.out.println("RedheadDuck");
        RedheadDuck duck_redhead = new RedheadDuck();
        duck_redhead.performQuack();
        duck_redhead.performFly();
        duck_redhead.display();
        duck_redhead.swim();
        System.out.println();

        System.out.println("RubberDuck");
        RubberDuck duck_rubber = new RubberDuck();
        duck_rubber.performQuack();
        duck_rubber.performFly();
        duck_rubber.display();
        duck_rubber.swim();
        System.out.println();

        System.out.println("DecoyDuck");
        DecoyDuck duck_decoy = new DecoyDuck();
        duck_decoy.performQuack();
        duck_decoy.performFly();
        duck_decoy.display();
        duck_decoy.swim();
        System.out.println();

        System.out.println("Behavior can be changed dynamically");
        System.out.println("MallardDuck");
        duck_mallard.performQuack();
        duck_mallard.setQuackBehavior(new Squeak());
        duck_mallard.performQuack();
    }
}
