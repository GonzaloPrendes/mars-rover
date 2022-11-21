package com.sample;

import java.util.Scanner;
import com.sample.common.CommandsSelector;
import com.sample.common.RoverCommandsOf;
import com.sample.common.RoversSelector;

public class App 
{

    public static void main( String[] args ) {
        new Nasa(
            new RoverCommandsOf(
                () -> new Scanner(System.in),
                    new RoversSelector(),
                    new CommandsSelector() 
                )
        ).startExpedition();
    }
}
