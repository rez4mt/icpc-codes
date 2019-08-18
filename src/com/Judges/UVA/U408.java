package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        while (sc.hasNext())
        {
            BigInteger step = sc.nextBigInteger();
            BigInteger mod = sc.nextBigInteger();
            sb.append(String.format("%10s%10s    %s\n\n",
                    step.toString(),mod.toString(),step.gcd(mod).equals(BigInteger.ONE)
                    ?"Good Choice":"Bad Choice"));
        }
        System.out.print(sb.toString());
    }
}
