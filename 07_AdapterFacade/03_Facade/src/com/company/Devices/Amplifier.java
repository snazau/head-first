package com.company.Devices;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier: on");
    }

    public void off() {
        System.out.println("Amplifier: off");
    }

    public void setDVD(DVDPlayer dvdPlayer) {
        System.out.println("Amplifier: setDVD with DVDPlayer");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier: setSurrountSound");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier: setVolume to " + volume);
    }
}
