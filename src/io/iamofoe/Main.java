package io.iamofoe;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> testCase = List.of("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2");

        System.out.println(dive(testCase));

    }

    //forward 5
    static int dive(List<String> commands) {
        int horizontalPosition = 0;
        int depth = 0;

        for (String command : commands) {

            String[] splitCommand = command.split(" ");

            String commandString = splitCommand[0];
            int commandValue = Integer.parseInt(splitCommand[1]);

            switch (commandString) {
                case "forward" -> horizontalPosition += commandValue;
                case "down" -> depth += commandValue;
                case "up" -> depth -= commandValue;
            }
        }

        return horizontalPosition * depth;
    }


}



