package com.company.Ducks;

import com.company.Behaviors.FlyBehavior.FlyWithWings;
import com.company.Behaviors.QuackBehavior.Squeak;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck specific display");
    }
}
