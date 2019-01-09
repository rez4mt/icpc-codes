package com.Judges.CodeForce.CF121;

import java.math.BigInteger;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a ;
        while (sc.hasNext())
        {
            a = sc.nextLong();
            System.out.println(next(a));;
        }
        //long b = sc.nextLong();
        /*BigInteger sum = BigInteger.ZERO;
        for(long i = a; i <= b ; i++)
        {
            sum = sum.add(BigInteger.valueOf(next(i)));
        }
        System.out.println(sum.toString());*/
    }
    static long next(long a)
    {
        while (!isLucky(a))
            a = luckey(a);
        return a;
    }
    static long luckey(long a)
    {
        long to_add = 0;
        long b = a;
        while (a!=0)
        {

            int rem = (int)(a%10);
            a/=10;
            if(rem!=4 && rem!=7)
            {

                if(rem<4)
                {
                    to_add+=4-rem;
                }else if(rem< 7)
                {
                    to_add+=7-rem;
                }else
                {
                    to_add += 10-rem;
                }
            }
            to_add *= 10;
        }
        to_add/=10;
        return b+rev(to_add);
    }
    static boolean isLucky(long a)
    {
        while (a!=0)
        {
            int rem = (int) (a%10);
            a /= 10;
            if(rem!=4 && rem!=7)
                return false;
        }
        return true;
    }
    static long rev(long a)
    {
        long rev_num = 0;
        while (a > 0)
        {
            rev_num = rev_num*10 + a%10;
            a = a/10;
        }
        return rev_num;
    }

}
