package com.Judges.CodeForce.CF1220;

import java.math.BigInteger;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i ++)
        {
            long val = sc.nextLong();
            for(int j = 1 ; j< N ; j++)
            {
                val = gcd(val , sc.nextLong());
            }
            if(i == N-1)
                System.out.println(val);
            else
                System.out.print(val+" ");
        }
    }
    private static long gcd(long val,long g)
    {
        return BigInteger.valueOf(val).gcd(BigInteger.valueOf(g)).intValue();
    }
}
