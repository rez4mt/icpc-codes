package com.Judges.CodeForce.CF1313;

import java.util.Scanner;

public class B
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
         while (T-->0)
         {
             int n = sc.nextInt();
             int a = sc.nextInt();
             int b = sc.nextInt();
             int worst = Math.min(n , a+b-1);
             int best = Math.max(1, Math.min(n , a+b-n+1)) ;
             System.out.println(best+" "+worst);
         }
    }
}
