// package ca.mths.unit1.unit02.java.main;
/**
* This program gets the length of logs from the user's input,
* calculates and display how much logs the truck can carry to the output.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-04-22
*/

import java.util.Scanner;


public final class Main {
    /**
     * Maple logs weigh 20 kg/m.
    */
    static final int WEIGHT_PER_METER = 20;
    /**
     * logging truck can carry 1100 kg.
    */
    static final int MAX_WEIGHT = 1100;

    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * This method get length of logs and
    * prints out how many logs can carry.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the length of the logs in meters."
                       + "\nValid choices are -> 0.25, 0.5, 1: ");

        // String input
        float lengthOfLogs = myObj.nextFloat();

        // Process
        float weightOfLog = WEIGHT_PER_METER * lengthOfLogs;
        float maxNumberOfLogs = MAX_WEIGHT / weightOfLog;

        // Output
        System.out.printf("The truck can carry " + (int) maxNumberOfLogs
                + " logs that are " + lengthOfLogs + " meter(s) long.");
    }
}
