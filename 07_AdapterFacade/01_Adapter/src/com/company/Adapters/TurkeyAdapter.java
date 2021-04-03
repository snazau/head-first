package com.company.Adapters;

import com.company.Interfaces.Duck;
import com.company.Interfaces.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // Since turkey can't fly a long distance we will do 5 short distance flights
        for (int i = 0; i < 5; ++i) {
            turkey.fly();
        }
    }
}
