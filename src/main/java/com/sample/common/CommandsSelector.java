package com.sample.common;

import java.util.Map;
import java.util.function.Function;
import com.sample.Command;
import com.sample.command.MoveCommand;
import com.sample.command.LeftCommand;
import com.sample.command.RightCommand;

public final class CommandsSelector implements Function<Character, Command> {

    private Map<Character, Command> commands; 

    public CommandsSelector() {
        this(
                Map.of(
                    'M', new MoveCommand(),
                    'L', new LeftCommand(),
                    'R', new RightCommand()
                )
           );
    }

    public CommandsSelector(Map<Character, Command> commands) {
        this.commands = commands;
    }

    @Override
    public Command apply(final Character letter) {
        return this.commands.get(letter);
    }
}
