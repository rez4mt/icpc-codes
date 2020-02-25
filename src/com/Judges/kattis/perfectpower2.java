package com.Judges.kattis;


import java.util.*;

public class perfectpower2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 2;
        while (true) {
            n = sc.nextInt();
            if(n == 0)
                break;
            System.out.println(greedy(n));
        }

    }
    private static int greedy(long n)
    {
        boolean neg = false;
        if (n<1)
        {
            neg = true;
            n *= -1;
        }
        for(int i = 31 ; i >= 1 ; i--)
        {
            double x = Math.pow(n , 1d / i);
            if(Math.abs(x - Math.round(x)) < 10e-9 )
            {
                if(!neg || i%2 == 1)
                {
                    if(Math.abs(Math.pow(Math.round(x) , i )-n) < 10e-9)
                    {
                        return i;
                    }
                }
            } else if (Math.ceil(x) - x < 0.0001) {
                long y = (long) Math.ceil(x);
                if (Math.abs(Math.pow(y, j) - n) <= 1e-9) {
                    if (!neg || (neg && j % 2 == 1)) {
                        return j;
                    }
                }
            }
        }
        return 1;

    }
    private static int greedy(long n)
    {
        boolean neg = false;
        if (n<1)
        {
            neg = true;
            n *= -1;
        }
        for(int i = 31 ; i >= 1 ; i--)
        {
            double x = Math.pow(n , 1d / i);
            if(Math.abs(x - Math.round(x)) < 10e-9 )
            {
                if(!neg || i%2 == 1)
                {
                    //if(Math.abs(Math.pow(x , i )-n) < 10e-9)
                    if(Math.abs(Math.pow(Math.round(x) , i )-n) < 10e-9)
                    {
                        return i;
                    }
                }
            }
        }
        return 1;

    }
}