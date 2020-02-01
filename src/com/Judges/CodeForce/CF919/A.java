package com.Judges.CodeForce.CF919;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N ,M ;
        N = sc.nextInt();
        M = sc.nextInt();
        double min = Double.POSITIVE_INFINITY;
        while (N-->0)
        {
            int a , b;
            a = sc.nextInt();
            b = sc.nextInt();
            double pfo = a / (double)b;
            min = Math.min(min , pfo*M);
        }
        System.out.printf("%.8f\n",min);
    }
}
