package com.company.Ducks;

import com.company.Behaviors.FlyBehavior.FlyNoWay;
import com.company.Behaviors.QuackBehavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck specific display");
    }
}
