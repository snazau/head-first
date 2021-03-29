package com.company.Devices;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public int speed;
    public String location;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        printSpeed();
    }

    public void medium() {
        speed = MEDIUM;
        printSpeed();
    }

    public void low() {
        speed = LOW;
        printSpeed();
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling fan at " + location + " was turned off");
    }

    public void printSpeed() {
        System.out.println("Ceiling fan at " + location + " running on speed = " + speed);
    }

    public int getSpeed() {
        return speed;
    }
}
