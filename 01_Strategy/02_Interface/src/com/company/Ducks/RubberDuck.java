package com.company.Ducks;

import com.company.interfaces.Quackable;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("RubberDuck specific display");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck specific quack");
    }
}
