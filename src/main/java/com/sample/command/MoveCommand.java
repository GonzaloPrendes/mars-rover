package com.sample.command;

import com.sample.Command;
import com.sample.Rover;

public final class MoveCommand implements Command {

    @Override
    public Rover execute(final Rover rover) {
        return rover.move();
    }

    @Override
    public String toString() {
        return "M";
    }
}

