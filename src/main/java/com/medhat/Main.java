package com.medhat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        final NumberFormat current = NumberFormat.getCurrencyInstance();
        final Scanner input = new Scanner(System.in);
        var mortgage = new Mortgage(current,input);
    }


}
