package com.Judges.CodeForce.CF1327;

import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n%2 == k%2)
            {
                if(k*1l*k<=n)
                    System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
    }
}