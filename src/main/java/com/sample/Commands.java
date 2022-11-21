package com.sample;

import java.util.List;

public final class Commands implements Command {

    private final List<Command> commands;

    public Commands(List<Command> cmds) {
        this.commands = cmds;
    }

    @Override
    public Rover execute(final Rover rover) {
        return this.commands
            .stream()
            .reduce(rover, (r, cmd) -> cmd.execute(r), (a, b) -> b);
    }
}
