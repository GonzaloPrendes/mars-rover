package com.sample;

public class Plateau {

    private final int upperX;

    private final int upperY;

    public Plateau(int upperX, int upperY) {
        this.upperX = upperX;
        this.upperY = upperY;
    }

    public boolean areValid(Coordinates coordinates) {
        return coordinates.areBetween(this.upperX, this.upperY);
    }

    @Override
    public boolean equals(Object other) {
        return other != null && other.getClass() == this.getClass() && this.equals((Plateau) other);
    }

    private boolean equals(Plateau other) {
        return this.upperX == other.upperX && this.upperY == other.upperY;
    }
}

