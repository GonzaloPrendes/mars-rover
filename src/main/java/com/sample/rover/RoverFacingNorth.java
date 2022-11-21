package com.sample.rover;

import com.sample.Coordinates;
import com.sample.Plateau;
import com.sample.Rover;

public final class RoverFacingNorth implements Rover {

    private final Coordinates coordinates;

    private final Plateau plateau;

    public RoverFacingNorth(Plateau plateau, Coordinates coordinates) {
        this.plateau = plateau;
        this.coordinates = coordinates;
    }

    @Override
    public Rover move() {
        final Coordinates newCoordinates = this.coordinates.addY();
        return this.plateau.areValid(newCoordinates)
                ? new RoverFacingNorth(this.plateau, newCoordinates)
                : this;
    }

    @Override
    public Rover spinLeft() {
        return new RoverFacingWest(this.plateau, this.coordinates);
    }

    @Override
    public Rover spinRight() {
        return new RoverFacingEast(this.plateau, this.coordinates);
    }

    @Override
    public String toString() {
        return this.coordinates + " N";
    }

}

