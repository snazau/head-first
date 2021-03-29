package com.company.Commands;

import com.company.Devices.CeilingFan;

public class CeilingFanOffCommand implements Command {
    public CeilingFan ceilingFan;
    public int lastSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        lastSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (lastSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
        else if (lastSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        else if (lastSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
        else if (lastSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
    }
}