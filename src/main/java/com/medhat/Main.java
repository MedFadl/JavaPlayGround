package com.medhat;

import com.medhat.generics.Listo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        var listo = new Listo<String>(5);
        listo.add("Ahmed");
        listo.add("Mohamed");
        listo.add("Mohsen");
        listo.add("Mourad");
        listo.add("Yousef");
        System.out.println(listo.len());
        System.out.println(listo.view(0));
        System.out.println(listo.view(4));


    }


}
