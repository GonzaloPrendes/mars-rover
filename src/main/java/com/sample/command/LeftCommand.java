package com.sample.command;

import com.sample.Command;
import com.sample.Rover;

public class LeftCommand implements Command {

    @Override
    public Rover execute(final Rover rover) {
        return rover.spinLeft();
    }

    @Override
    public String toString() {
        return "L";
    }
}

