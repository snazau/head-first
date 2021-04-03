package com.company;

import com.company.Devices.*;
import com.company.Facades.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
            amplifier,
            dvdPlayer,
            projector,
            lights,
            screen,
            popper
        );

        homeTheater.watchMovie("1 + 1");
        System.out.println();
        homeTheater.endMovie();
    }
}
