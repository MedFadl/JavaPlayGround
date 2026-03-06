package com.medhat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;

    public static void main(String[] args) {

        double principal = readValue("Principal: ",1000,1_000_000);
        double rate = readValue("Annual Interest Rate: ",0,30);
        int years = (int) readValue("Period (Years): ",0,30);



        NumberFormat current = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + current.format(monthlyPayment(principal,rate,years)));

    }




















    /**
     * This is a function takes number from user and validate it as if it is between 2 specific numbers or not
     * @param prompt as a message to display before user enter a number
     * @param min as minimum to put
     * @param max as maximum to put
     * @return returns a double value when it is validated! :'D
     */

    static double readValue(String prompt , double min , double max)
    {
        double value;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            value = input.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between " + min + " and " + max);
        }
        input.close();
        return value;
    }

    /**
     * I love java docs :D
     * @param principal takes principal value
     * @param rate takes annual rate
     * @param years takes how many years should be calculated
     * @return monthly payment based on the 3 input and Mortgage
     */
    static double monthlyPayment(double principal , double rate, int years) {
        double annualInterestRate = (rate / PERCENTAGE) / MONTHS_IN_YEAR;
        years = years * MONTHS_IN_YEAR;
        double compoundFactor = Math.pow((1 + annualInterestRate), years);
        return principal * (annualInterestRate * (compoundFactor)) / (compoundFactor - 1);


    }
}
