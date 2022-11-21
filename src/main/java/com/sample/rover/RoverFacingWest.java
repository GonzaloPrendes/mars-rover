package com.sample.rover;

import com.sample.Coordinates;
import com.sample.Plateau;
import com.sample.Rover;

public class RoverFacingWest implements Rover {

    private final Coordinates coordinates;

    private final Plateau plateau;

    public RoverFacingWest(Plateau plateau, Coordinates coordinates) {
        this.plateau = plateau;
        this.coordinates = coordinates;
    }

    @Override
    public Rover move() {
        final Coordinates newCoordinates = this.coordinates.subtractX();
        return this.plateau.areValid(newCoordinates)
                    ? new RoverFacingWest(this.plateau, newCoordinates)
                    : this;
    }

    @Override
    public Rover spinLeft() {
        return new RoverFacingSouth(this.plateau, this.coordinates);
    }

    @Override
    public Rover spinRight() {
        return new RoverFacingNorth(this.plateau, this.coordinates);
    }

    @Override
    public String toString() {
        return this.coordinates + " W";
    }
}

