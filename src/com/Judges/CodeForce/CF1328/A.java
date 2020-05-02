package com.Judges.CodeForce.CF1328;

import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a%b == 0)
                System.out.println(0);
            else

                System.out.println(b - (a%b));
        }
    }
}