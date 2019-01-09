package com.Judges.uri;

import java.util.Scanner;

public class P1015 {
    public P1015()
    {
        Scanner sc = new Scanner(System.in);
        double x1,y1,x2,y2;
        x1 = Double.parseDouble(sc.next());
        y1 = Double.parseDouble(sc.next());
        x2 = Double.parseDouble(sc.next());
        y2 = Double.parseDouble(sc.next());
        System.out.printf("%.4f\n",Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }

    public static void main(String[] args) {
        new P1015();
    }
}
