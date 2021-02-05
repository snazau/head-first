package com.company.Ducks;

import com.company.Behaviors.FlyBehavior.FlyWithWings;
import com.company.Behaviors.QuackBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck specific display");
    }
}
