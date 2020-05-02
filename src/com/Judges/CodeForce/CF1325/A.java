package com.Judges.CodeForce.CF1325;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int x = sc.nextInt();
            /*boolean flag = false;
            for(int i = 1 ; i < x && !flag ; i++)
            {
                for(int j = i ; j<x;j++)
                {
                    int gcd = gcd(i,j);
                    long lcm = lcm(i,j,gcd);
                    if(lcm+gcd==x)
                    {
                        System.out.println(i+" "+j);
                        flag = true;
                        break;
                    }
                    if(lcm+gcd>x)
                        break;
                }
            }*/
            System.out.println(1+" "+(x-1));
        }
    }
    private static long lcm(int a , int b , int gcd)
    {
        return (1l*a*b) / gcd;
    }
    private static int gcd(int a , int b)
    {
        if(b == 0)
            return a;
        if(a==b)
            return a;
        return gcd(b , a%b);
    }
}
