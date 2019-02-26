package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U10070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            BigInteger y = sc.nextBigInteger();
            boolean by100 = y.mod(BigInteger.valueOf(100)).compareTo(BigInteger.ZERO) == 0;
            boolean by4   = y.mod(BigInteger.valueOf(4)).compareTo(BigInteger.ZERO) == 0;
            boolean by400   = y.mod(BigInteger.valueOf(400)).compareTo(BigInteger.ZERO) == 0;
            boolean by15 = y.mod(BigInteger.valueOf(15)).compareTo(BigInteger.ZERO) == 0;
            boolean by55 = y.mod(BigInteger.valueOf(55)).compareTo(BigInteger.ZERO) == 0;
            boolean flag = false;
            boolean l = false;
            if((by4 && !by100) || by400)
            {
                flag = true;
                l = true;
                System.out.println("This is leap year.");
            }

            if(by15)
            {
                flag = true;
                System.out.println("This is huluculu festival year.");
            }
            if(by55 && l)
            {
                flag = true;
                System.out.println("This is bulukulu festival year.");
            }

            if(!flag)
                System.out.println("This is an ordinary year.");
            System.out.println();
        }
    }
}
