package com.Judges.CodeForce.CF1101;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            // a/c;
            double min = (double) a/c;
            if(min <= 1)
            {
                long n = b/c;
                System.out.println((n+1)*c);
            }else
            {
                System.out.println(c);
            }
        }
    }
}
