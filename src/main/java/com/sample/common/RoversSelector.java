package com.sample.common;

import com.sample.rover.RoverFacingEast;
import com.sample.rover.RoverFacingWest;
import com.sample.rover.RoverFacingNorth;
import com.sample.rover.RoverFacingSouth;
import com.sample.Coordinates;
import java.util.Map;
import com.sample.Plateau;
import com.sample.Rover;

public final class RoversSelector implements Function4<Plateau, Integer, Integer, String, Rover> {

    private final Map<String, Function3<Plateau, Integer, Integer, Rover>> rovers;

    public RoversSelector() {
        this(
                Map.of(
                    "N", (p, x, y) -> new RoverFacingNorth(p, new Coordinates(x, y)),
                    "S", (p, x, y) -> new RoverFacingSouth(p, new Coordinates(x, y)),
                    "W", (p, x, y) -> new RoverFacingWest(p, new Coordinates(x, y)),
                    "E", (p, x, y) -> new RoverFacingEast(p, new Coordinates(x, y))
                )
        );
    }

    public RoversSelector(Map<String, Function3<Plateau, Integer, Integer, Rover>> rovers) {
        this.rovers = rovers;
    }

    @Override
    public Rover apply(Plateau plateau, Integer x, Integer y, String facing) {
        return this.rovers.get(facing).apply(plateau, x, y);
    }
}

