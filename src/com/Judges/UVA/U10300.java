package com.Judges.UVA;


import java.util.Arrays;
import java.util.Scanner;


public class U10300{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            long sum = 0 ;

            while (N-->0)
            {
                long a = sc.nextInt();
                long b = sc.nextInt();
                long c = sc.nextInt();
                sum += a*c;
            }
            System.out.println(sum);
        }
    }
}