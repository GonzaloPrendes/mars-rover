package com.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import com.sample.rover.RoverFacingEast;

public final class RoverFacingEastTest {

   @Test
   public void cannotMoveOffPlateau() {
      assertThat(
            new RoverFacingEast(
               new Plateau(5, 5),
               new Coordinates(5, 2)
            ).move().toString(),
            is("5 2 E")
      );
   }
}
