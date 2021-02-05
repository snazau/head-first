package com.company;

import com.company.interfaces.Flyable;
import com.company.interfaces.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("MallardDuck specific display");
    }

    @Override
    public void fly() {
        // Duplicate code
        System.out.println("Fly as normal duck");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck specific quack");
    }
}
