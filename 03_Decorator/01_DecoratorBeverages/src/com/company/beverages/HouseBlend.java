package com.company.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "Delicious HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
