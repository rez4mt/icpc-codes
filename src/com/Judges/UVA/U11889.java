package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U11889 {
    static long MAX = (long)10E7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            long a = sc.nextLong();
            long c = sc.nextLong();
            if(c%a == 0)
            {
                long b = c/a;
                for(long i = b;i<MAX;i+=b)
                {
                    if(lcm(a,i) == c)
                    {
                        System.out.println(i);
                        break;
                    }
                }
            }else
                System.out.println("NO SOLUTION");

        }
    }
    private static long lcm(long a,long b)
    {
        return (a*b)/BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();

    }
}
