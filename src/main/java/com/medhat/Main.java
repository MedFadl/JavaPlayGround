package com.medhat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;
    static NumberFormat current = NumberFormat.getCurrencyInstance();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double principal = readValue("Principal: ",1000,1_000_000);
        double rate = readValue("Annual Interest Rate: ",0,30);
        int years = (int) readValue("Period (Years): ",0,30);



        mortgageDetails(principal,rate,years);
        input.close();

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
     * I love java docs :D
     * @param principal takes principal value
     * @param annualInterestRate takes annual rate
     * @param months takes how many months should be calculated
     * @return monthly payment based on the 3 input and Mortgage
     */
    static double monthlyPayment(double principal , double annualInterestRate, int months) {
        double compoundFactor = Math.pow((1 + annualInterestRate), months);
        return principal * (annualInterestRate * (compoundFactor)) / (compoundFactor - 1);
    }


    /**
     * Created by medhat <b><3</b><br>
     * provides detailed mortgage information "How much payment per month till it ends"
     * @param principal takes original principal value
     * @param rate takes the rate and converts it into annul rate
     * @param years takes years and calculate it into months
     *
     */


    static void mortgageDetails(double principal , double rate, int years){

        double annualInterestRate = (rate / PERCENTAGE) / MONTHS_IN_YEAR;
        short months = (short) (years * MONTHS_IN_YEAR);
        double payment;


        System.out.println("\n");
        System.out.println("MORTGAGE");
        System.out.println("------");
        System.out.println(current.format(monthlyPayment(principal,annualInterestRate,months)));
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------");
        System.out.println("\n");

        for (int i = 1; i <= months; i++)
        {
            double powed = Math.pow((1 + annualInterestRate), months);
            payment = principal * (powed - Math.pow((1+annualInterestRate),i)) / (powed - 1);
            System.out.println(current.format(payment));
        }
    }
}
