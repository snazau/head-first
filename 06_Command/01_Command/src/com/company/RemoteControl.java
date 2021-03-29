package com.company;

import com.company.Commands.Command;
import com.company.Commands.noCommand;

public class RemoteControl {
    public Command[] onCommands;
    public Command[] offCommands;
    public Command lastCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new noCommand();
        for (int i = 0; i < onCommands.length; ++i) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand) {
        onCommands[slotNumber] = onCommand;
        offCommands[slotNumber] = offCommand;
    }

    public void onButtonPushed(int slotNumber) {
        onCommands[slotNumber].execute();
        lastCommand = onCommands[slotNumber];
    }

    public void offButtonPushed(int slotNumber) {
        offCommands[slotNumber].execute();
        lastCommand = offCommands[slotNumber];
    }

    public void undoButtonPushed() {
        lastCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ RemoteControl ------\n");
        for (int i = 0; i < onCommands.length; ++i) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuilder.append("[undo] " + lastCommand.getClass().getName());
        return stringBuilder.toString();
    }
}
