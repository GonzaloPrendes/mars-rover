package com.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.sample.rover.RoverFacingWest;
import org.junit.Test;

public final class RoverFacingWestTest {

   @Test
   public void cannotMoveOffPlateau() {
      assertThat(
            new RoverFacingWest(
               new Plateau(5, 5),
               new Coordinates(0, 5)
            ).move().toString(),
            is("0 5 W")
      );
   }
}
