package com.Judges.CodeForce.CF479;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int[] operations = new int[]{
                a+b+c,(a+b)*c, a+(b*c),a*(b+c),(a*b)+c,a*b*c
        };
        int max = 0;
        for (int o :
                operations) {
            max = Math.max(max, o);
        }
        System.out.println(max);
    }
}
