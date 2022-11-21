package com.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import com.sample.command.MoveCommand;
import com.sample.command.RightCommand;
import com.sample.rover.RoverFacingEast;
import org.junit.Test;

public final class CommandsTest {

    @Test
    public void canExecuteCommands() {
        assertThat(
                new Commands(
                    List.of(
                        new MoveCommand(),
                        new MoveCommand(),
                        new RightCommand(),
                        new MoveCommand(),
                        new MoveCommand(),
                        new RightCommand(),
                        new MoveCommand(),
                        new RightCommand(),
                        new RightCommand(),
                        new MoveCommand()
                    )
                ).execute(
                    new RoverFacingEast(
                        new Plateau(5, 5),
                        new Coordinates(3, 3)
                    )
                ).toString(),
                is("5 1 E")
        );
    }
}
