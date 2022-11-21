package com.sample.rover;

import com.sample.Coordinates;
import com.sample.Plateau;
import com.sample.Rover;

public class RoverFacingSouth implements Rover {

    private final Coordinates coordinates;

    private final Plateau plateau;

    public RoverFacingSouth(Plateau plateau, Coordinates coordinates) {
        this.plateau = plateau;
        this.coordinates = coordinates;
    }

    @Override
    public Rover move() {
        final Coordinates newCoordinates = this.coordinates.subtractY();
        return this.plateau.areValid(newCoordinates)
                    ? new RoverFacingSouth(this.plateau, newCoordinates)
                    : this;
    }

    @Override
    public Rover spinLeft() {
        return new RoverFacingEast(this.plateau, this.coordinates);
    }

    @Override
    public Rover spinRight() {
        return new RoverFacingWest(this.plateau, this.coordinates);
    }

    @Override
    public String toString() {
        return this.coordinates + " S";
    }
}

