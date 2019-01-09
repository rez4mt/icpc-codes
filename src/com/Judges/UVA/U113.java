package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int a = sc.nextInt();
            BigInteger b = sc.nextBigInteger();
            System.out.println(NthRootCalculator.calculate(b.doubleValue(),(double)a));
        }
    }
    static class NthRootCalculator {
        public static Long calculate(Double base, Double n) {
            return Math.round(Math.pow(Math.E, Math.log(base)/n));
        }
    }
}
