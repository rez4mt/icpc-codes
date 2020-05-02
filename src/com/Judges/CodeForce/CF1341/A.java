package com.Judges.CodeForce.CF1341;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  T = sc.nextInt();
        while(T-->0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            boolean flag = false;
            if (n * (a + b) < c - d || (n * (a - b)) > c + d)
            {
                System.out.println("No");
            }else System.out.println("Yes");

        }
    }
}
