package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            BigInteger a = new BigInteger(sc.next());
            sc.next();
            BigInteger b = new BigInteger(sc.next());
            BigInteger gcd = a.gcd(b);
            System.out.printf("%s / %s\n",a.divide(gcd).toString(),b.divide(gcd).toString());
        }
    }
}
