package com.medhat;

import com.medhat.generics.Listo;

import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Listo<String> ele = new Listo<String>(10);
        ele.add("a");
        ele.add("b");
        ele.add("c");
        ele.add("d");
        ele.add("e");
        ele.view(1);
        ele.viewALL();
        for(String x :ele){
            System.out.println(x);
        }


    }


}