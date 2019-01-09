package com.Judges.uri;

import java.util.Scanner;

public class P1011 {
    public P1011()
    {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        int r = sc.nextInt();
        System.out.printf("VOLUME = %.3f\n",(4.0/3.0)*pi*Math.pow(r,3));
    }
    public static void main(String[] args) {
        new P1011();
    }
}
