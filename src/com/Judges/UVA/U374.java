package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            BigInteger b = sc.nextBigInteger();
            BigInteger p = sc.nextBigInteger();
            BigInteger m = sc.nextBigInteger();
            System.out.println(b.modPow(p,m));
        }

    }
}
