package com.medhat;

import java.util.Scanner;

public class Reader {
    private final Scanner input = new Scanner(System.in);


    /**
     * This is a function takes number from user
     *
     * @param prompt as a message to display before user enter a number
     */

    public double setValue(String prompt)
    {
        System.out.print(prompt);
        return input.nextDouble();
    }

    /**
     * This is a function takes number from user and validate it as if it is between 2 specific numbers or not
     *
     * @param prompt as a message to display before user enter a number
     * @param min    as minimum to put
     * @param max    as maximum to put
     */

    public double setValue(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = input.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    /**
     * This function is there to close the custom reader i have created .. :D
     *
     */
    public void closeReader(){
        input.close();
    }



}
