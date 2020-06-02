package com.Judges.CodeForce.CF1360;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = Math.min(a,b);
            int max = Math.max(a,b);
            if((min+min)>=max)
            {
                System.out.println((int)Math.pow(min+min,2));
            }else {
                System.out.println((int)Math.pow(max,2));
            }
        }
    }
}
