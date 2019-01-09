package com.Judges.uri;

import java.util.Scanner;

public class P1006 {
    public P1006()
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        a = Double.parseDouble(sc.next());
        b = Double.parseDouble(sc.next());
        c = Double.parseDouble(sc.next());
        double sum = (a*2) + (b*3) + (c*5);
        System.out.printf("MEDIA = %.1f\n",sum/10);
    }

    public static void main(String[] args) {
        new P1006();
    }
}
