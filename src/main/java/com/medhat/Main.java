package com.medhat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        final NumberFormat current = NumberFormat.getCurrencyInstance();
//         var mortgage = new Mortgage(current);

        // trying some oop logic ;-;
        var point1 = new Point(1,5);
        var point2 = new Point(1,5);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println(point1.equals(point2));

    }


}
