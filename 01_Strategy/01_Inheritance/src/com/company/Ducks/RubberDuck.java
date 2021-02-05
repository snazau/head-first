package com.company.Ducks;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("RubberDuck specific display");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck specific quack");
    }

    @Override
    public void fly() {
        // Since RubberDuck can't fly we have to override an empty implementation
    }
}
