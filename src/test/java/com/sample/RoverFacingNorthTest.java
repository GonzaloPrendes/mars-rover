package com.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.sample.rover.RoverFacingNorth;
import org.junit.Test;

public final class RoverFacingNorthTest {

    @Test
    public void canSpinLeft() {
        assertThat(
            new RoverFacingNorth(
                new Plateau(5, 5),
                new Coordinates(1, 2)
            ).spinLeft().toString(),
            is("1 2 W")
        );
    }

    @Test
    public void cannotMoveOffPlateau() {
        assertThat(
            new RoverFacingNorth(
                new Plateau(5, 5),
                new Coordinates(3, 5)
            ).move().toString(),
            is("3 5 N")
        );
    }
}
