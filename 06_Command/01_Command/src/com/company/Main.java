package com.company;

import com.company.Commands.*;
import com.company.Devices.CeilingFan;
import com.company.Devices.GarageDoor;
import com.company.Devices.Light;
import com.company.Devices.Stereo;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan("Hall");

        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        Command[] patryOnCommands = {garageDoorUpCommand, stereoOnWithCDCommand};
        MacroCommand partyGoesWildCommand = new MacroCommand(patryOnCommands);

        Command[] partyOffCommands = {stereoOffCommand, garageDoorDownCommand};
        MacroCommand partyGoesBrrrCommand = new MacroCommand(partyOffCommands);

        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(3, partyGoesWildCommand, partyGoesBrrrCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonPushed(0);
        remoteControl.onButtonPushed(2);
        System.out.println(remoteControl);

        remoteControl.undoButtonPushed();
        System.out.println(remoteControl);

        remoteControl.onButtonPushed(3);
        System.out.println(remoteControl);

        remoteControl.offButtonPushed(3);
        System.out.println(remoteControl);
    }
}
