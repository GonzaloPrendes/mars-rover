package com.sample.command;

import com.sample.Command;
import com.sample.Rover;

public final class RightCommand implements Command {

    @Override
    public Rover execute(final Rover rover) {
        return rover.spinRight();
    }

    @Override
    public String toString() {
        return "R";
    }
}
