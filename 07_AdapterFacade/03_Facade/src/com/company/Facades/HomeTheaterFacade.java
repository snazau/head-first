package com.company.Facades;

import com.company.Devices.*;

public class HomeTheaterFacade {
    Amplifier amplifier;
    DVDPlayer dvdPlayer;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(
            Amplifier amplifier,
            DVDPlayer dvdPlayer,
            Projector projector,
            TheaterLights lights,
            Screen screen,
            PopcornPopper popper
    ) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDVD(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
