package com.company.Ducks;

import com.company.Behaviors.FlyBehavior.FlyNoWay;
import com.company.Behaviors.QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck specific display");
    }
}
