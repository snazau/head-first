package com.company.Devices;

public class TheaterLights {
    public void on() {
        System.out.println("TheaterLights: on");
    }

    public void dim(int lightValue) {
        System.out.println("TheaterLights dimming to " + lightValue + "%");
    }
}
