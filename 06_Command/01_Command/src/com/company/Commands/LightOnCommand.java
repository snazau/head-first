package com.company.Commands;

import com.company.Devices.Light;

public class LightOnCommand implements Command {
    public Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
