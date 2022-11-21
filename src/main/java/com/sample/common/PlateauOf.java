package com.sample.common;

import java.util.function.Supplier;

import com.sample.Plateau;

public class PlateauOf implements Supplier<Plateau> {

    private final String content;

    public PlateauOf(String content) {
        this.content = content;
    }

    @Override
    public Plateau get() {
        final String[] line = this.content.split("\\s+");
        return new Plateau(
                Integer.parseInt(line[0]),
                Integer.parseInt(line[1])
        );
    }
}

