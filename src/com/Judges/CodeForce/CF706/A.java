package com.Judges.CodeForce.CF706;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt();
        int tc = sc.nextInt();
        double minT = Double.MAX_VALUE;
        while (tc -- > 0)
        {
            int x2 = sc.nextInt(),y2 = sc.nextInt(),v = sc.nextInt();
            double distance = Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));
            double time = distance / v;
            minT = Math.min(time,minT);
        }
        System.out.printf("%.22f",minT);
    }
}
