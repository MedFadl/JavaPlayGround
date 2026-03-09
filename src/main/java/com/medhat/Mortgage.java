package com.medhat;

import java.text.NumberFormat;

public class Mortgage {

    // Some variables and instances <3
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENTAGE = 100;
    private final NumberFormat current;

    //Constructor
    public  Mortgage(NumberFormat current){
        this.current = current;
        var reader = new Reader();
        double principal = reader.setValue("Principal: ", 1000, 1_000_000);
        double rate = reader.setValue("Annual Interest Rate: ", 0, 30);
        int years = (int) reader.setValue("Period (Years): ", 0, 30);
        mortgageDetails(principal, rate, years);
        reader.closeReader();
    }



    /**
     * I love java docs :D
     * @param principal takes principal value
     * @param annualInterestRate takes annual rate
     * @param months takes how many months should be calculated
     * @return double value - monthly payment based on the 3 input and Mortgage
     */
    private double monthlyPayment(double principal , double annualInterestRate, int months) {
        if (annualInterestRate == 0) {
            return principal / months;
        }
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


    private void mortgageDetails(double principal , double rate, int years){
        double annualInterestRate = (rate / PERCENTAGE) / MONTHS_IN_YEAR;
        short months = (short) (years * MONTHS_IN_YEAR);
        double payment;
        System.out.println("\n");
        System.out.println("MORTGAGE");
        System.out.println("------");
        System.out.println(current.format(monthlyPayment(principal, annualInterestRate, months)));

        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------");
        System.out.println("\n");

        if(annualInterestRate != 0) {
            for (int i = 1; i <= months; i++) {
                double powed = Math.pow((1 + annualInterestRate), months);
                payment = principal * (powed - Math.pow((1 + annualInterestRate), i)) / (powed - 1);
                System.out.println(current.format(payment));
            }
        }
            else {
            for (int i = 1; i <= months; i++) {
                System.out.println(current.format(principal / months));
            }
            }

        }
    }
