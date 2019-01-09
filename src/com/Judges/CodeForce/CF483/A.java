package com.Judges.CodeForce.CF483;

import java.math.BigInteger;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        long a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();

        for(long i = a;i<b;i++)
        {
            for(long j = a+1;j<=b;j++)
            {
                for(long k = a+2;k<=b;k++)
                {
                    if(gcd(i,j)==1 && gcd(j,k)==1 && gcd(i,k)!=1)
                    {
                        System.out.printf("%d %d %d\n",i,j,k);
                        return;
                    }
                }
            }
        }
        System.out.println("-1");
    }
    private static int gcd(long a,long b){
        BigInteger a2 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        return b2.gcd(a2).intValue();
    }
}
