package com.company.Ducks;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("DecoyDuck specific display");
    }

    @Override
    public void quack() {
        // Since DecoyDuck can't fly we have to override an empty implementation
    }

    @Override
    public void fly() {
        // Since DecoyDuck can't fly we have to override an empty implementation
    }
}
