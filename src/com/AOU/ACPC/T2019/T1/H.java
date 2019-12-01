package com.AOU.ACPC.T2019.T1;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        long s = sc.nextInt();
        long s2 = (long) Math.pow(s,2);
        double r2 = (s2/(1-Math.cos(Math.toRadians(360d/v))))/2d;
        System.out.printf("%.9f\n",Math.PI * r2);
    }
}
