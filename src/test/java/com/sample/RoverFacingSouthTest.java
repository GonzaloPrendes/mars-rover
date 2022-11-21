package com.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.sample.rover.RoverFacingSouth;
import org.junit.Test;

public final class RoverFacingSouthTest {

   @Test
   public void cannotMoveOffPlateau() {
      assertThat(
            new RoverFacingSouth(
               new Plateau(5, 5),
               new Coordinates(0, 0)
            ).move().toString(),
            is("0 0 S")
      );
   }
}
