package com.sample;

public final class RoverCommands {

    private final Rover rover;

    private final Commands commands;

    public RoverCommands(Rover rover, Commands commands) {
        this.rover = rover;
        this.commands = commands;
    }

    public Rover sendCommands() {
        return this.commands.execute(rover);
    }
}

