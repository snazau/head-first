package com.company.Ducks;

import com.company.interfaces.Flyable;
import com.company.interfaces.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("RedheadDuck specific display");
    }

    @Override
    public void fly() {
        // Duplicate code
        System.out.println("Fly as normal duck");
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck specific quack");
    }
}
