package com.Judges.uri;

import java.util.Scanner;

public class P1052 {
    public static void main(String[] args) {
        new P1052();
    }
    public P1052()
    {
        Scanner sc = new Scanner(System.in);
        String[] month = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.printf("%s\n",month[sc.nextInt()-1]);
    }
}
