package com.company.Devices;

public class Stereo {
    public double volume;

    public Stereo() {
        volume = 10;
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo: CD was set");
    }

    public void setDVD() {
        System.out.println("Stereo: DVD was set");
    }

    public void setRadio() {
        System.out.println("Stereo: Radio is on");
    }

    public void setVolume(double volume) {
        System.out.println("Stereo: volume was changed from " + this.volume + " to " + volume);
        this.volume = volume;
    }
}
