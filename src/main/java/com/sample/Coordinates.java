package com.sample;

public class Coordinates {

    private final int x;

    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates addY() {
        return new Coordinates(this.x, this.y + 1);
    }

    public Coordinates addX() {
        return new Coordinates(this.x + 1, this.y);
    }


    public Coordinates subtractY() {
        return new Coordinates(this.x, this.y - 1);
    }
   

    public Coordinates subtractX() {
        return new Coordinates(this.x - 1, this.y);
    }

    
    public boolean areBetween(int upperX, int upperY) {
        return this.x >= 0 && this.x <= upperX && this.y >= 0 && this.y <= upperY;
    }

    @Override
    public boolean equals(Object other) {
        return other != null && other.getClass() == this.getClass() && this.equals((Coordinates) other);
    }

    private boolean equals(Coordinates other) {
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y; 
    }
}

