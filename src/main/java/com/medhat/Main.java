package com.medhat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        int years;
        

        while (true) {
            System.out.print("Principal: ");
            principal = input.nextDouble();
            if (principal < 1000 || principal > 1_000_000) {

                System.out.println("Please enter a number between 1k to 1M!!");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            rate = input.nextDouble();
            if (rate <= 0 || rate > 30) {
                System.out.println("Please enter a number between 0 to 30");
                continue;
            }
            break;
        }
        

        while (true) {
            System.out.print("Period (Years): ");
            years = input.nextInt();
            if (years < 1 || years > 30) {
                System.out.println("Please enter a number between 0 to 30");
                continue;
            }
            break;
        }


        NumberFormat current = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + current.format(monthlyPayment(rate,years,principal)));

    }

    static double monthlyPayment(double principal , double rate, int years) {
        double annualInterestRate = (rate / PERCENTAGE) / MONTHS_IN_YEAR;
        years = years * MONTHS_IN_YEAR;
        double compoundFactor = Math.pow((1 + annualInterestRate), years);
        return principal * (annualInterestRate * (compoundFactor)) / (compoundFactor - 1);


    }
}
