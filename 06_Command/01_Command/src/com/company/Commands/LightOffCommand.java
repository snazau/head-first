package com.company.Commands;

import com.company.Devices.Light;

public class LightOffCommand implements Command {
    public Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
