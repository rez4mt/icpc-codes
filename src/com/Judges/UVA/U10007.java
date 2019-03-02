package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U10007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int a = sc.nextInt();

            System.out.println(BigInteger.valueOf(2).pow((int)(Math.log10(a)/Math.log10(2))).multiply(BigInteger.valueOf(2)).toString());
        }
    }
}
