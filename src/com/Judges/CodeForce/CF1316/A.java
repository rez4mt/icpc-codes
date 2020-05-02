package com.Judges.CodeForce.CF1316;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long sum = 0 ;
            for(int i = 0 ; i< n ; i++)
            {
                sum += sc.nextInt();
            }
            System.out.println(Math.min(m , sum));
        }
    }
}
