package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            String a = new StringBuilder(sc.next()).reverse().toString();
            String b = new StringBuilder(sc.next()).reverse().toString();
            String c = new BigInteger(new StringBuilder((new BigInteger(a).add(new BigInteger(b))).toString()).reverse().toString()).toString();
            System.out.println(c);
        }

    }
}
