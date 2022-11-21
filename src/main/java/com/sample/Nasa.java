package com.sample;

import java.util.List;
import java.util.function.Supplier;

public class Nasa {
    
    private final Supplier<List<RoverCommands>> roverCommands;

    public Nasa(Supplier<List<RoverCommands>> roverCommands) {
        this.roverCommands = roverCommands;
    }

    public void startExpedition() {
         roverCommands.get()
             .stream()
             .map(RoverCommands::sendCommands)
             .forEach(System.out::println);
    }
}

