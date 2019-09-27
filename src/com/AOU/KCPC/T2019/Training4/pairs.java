//package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class pairs {

    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(new File("fractions.in"));
        int[] divisors = new int[501];
        for (int i = 2; i < divisors.length; i++) {
            int c = 0;
            int sqrt = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++) {
                if(i%j==0)   c++;
            }
            divisors[i] = c*2;
            if(sqrt == Math.sqrt(i))
                divisors[i]--;

        }

        int[] div2 = new int[501];
        //System.out.println(Arrays.toString(divisors));
        for(int i = 1 ; i < 501 ;i++)
        {
            div2[i] = div2[i-1]+divisors[i];
            if(i >= 3)
                div2[i]++;
            div2[i] += (i-1)/2;
            if(i>=3) div2[i]--;
            /*else if(i>=3)
            {

                *//*for(int j = 3; j<=i ;j++)
                {
                    if(gcd(i , j) == 1)
                        div2[i]++;
                }*//*
            }*/
        }

        int T = sc.nextInt();
        div2[5]++;
        while (T-->0)
        {
            int N = sc.nextInt();
            long val = N * (N*(N-1))/2;
            val += div2[N];
            System.out.println(val);
        }
    }
    private static int gcd(int a,  int b)
    {
        if(b == 0)
            return a;
        return gcd(b , a%b);
    }
}
