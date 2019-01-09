package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U424 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger sum = BigInteger.ZERO;
        while (sc.hasNext())
        {
            BigInteger a = sc.nextBigInteger();
            if(a.compareTo(BigInteger.ZERO) == 0)
                break;
            sum = sum.add(a);
        }
        System.out.println(sum.toString());

    }
}
