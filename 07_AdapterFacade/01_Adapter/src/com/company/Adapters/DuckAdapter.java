package com.company.Adapters;

import com.company.Interfaces.Duck;
import com.company.Interfaces.Turkey;

import java.util.Random;

public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        // Since duck can only fly a long distance we'll make it fly once in 5 times on average
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
