package com.Judges.a2;

import java.util.Scanner;

public class A383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            double r = sc.nextDouble();
            double area = Math.pow(r+r,2)* 8;
            System.out.println(area);
        }
    }
}
