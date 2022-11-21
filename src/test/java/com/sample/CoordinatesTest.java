package com.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public final class CoordinatesTest {

    @Test
    public void canAddX() {
        assertThat(
                new Coordinates(1, 1).addX(),
                is(new Coordinates(2, 1))
        );
    }
}

