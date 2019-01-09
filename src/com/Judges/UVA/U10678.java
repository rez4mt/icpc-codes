package com.Judges.UVA;

import java.util.Scanner;

public class U10678 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0)
        {
            int a = sc.nextInt(),b = sc.nextInt();
            double A = b / 2.0;
            double B = 0.5 * Math.sqrt(b * b - a * a);
            System.out.printf("%.3f\n", Math.PI * A * B);
        }
    }
}
