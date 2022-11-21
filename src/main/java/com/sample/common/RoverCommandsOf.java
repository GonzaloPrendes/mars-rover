package com.sample.common;

import com.sample.Rover;
import com.sample.Plateau;
import com.sample.Command;
import com.sample.Commands;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import com.sample.RoverCommands;
import java.util.Scanner;

public final class RoverCommandsOf implements Supplier<List<RoverCommands>> {

    private final Supplier<Scanner> input;

    private final Function4<Plateau, Integer, Integer, String, Rover> roverSelector;

    private final Function<Character, Command> commandSelector;

    public RoverCommandsOf(Supplier<Scanner> input, 
            Function4<Plateau, Integer, Integer, String, Rover> roverSelector,
            Function<Character, Command> cmdSelector) {
        this.input = input;
        this.roverSelector = roverSelector;
        this.commandSelector = cmdSelector;
    }

    @Override
    public List<RoverCommands> get() {
        final List<RoverCommands> roverCommands = new ArrayList<>();
        final Scanner scanner = this.input.get();
        final Plateau plateau = new PlateauOf(scanner.nextLine()).get();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.isBlank()) break;
            final String[] roverLine = line.split("\\s+");
            final String commandsLine = scanner.nextLine();
            roverCommands.add(
                    new RoverCommands(
                        this.getRover(plateau, roverLine),
                        this.getCommands(commandsLine)
                    )
            );
        }
        scanner.close();
        return roverCommands;
    }

    private Rover getRover(final Plateau plateau, final String[] roverLine) {
        return roverSelector.apply(
                plateau, 
                Integer.parseInt(roverLine[0]), 
                Integer.parseInt(roverLine[1]), 
                roverLine[2]
        );
    }

    private Commands getCommands(final String commandsLine) {
        return new Commands( 
                commandsLine.chars()
                .mapToObj(c -> this.commandSelector.apply((char)c))
                .collect(Collectors.toList())
        );
    }
}

