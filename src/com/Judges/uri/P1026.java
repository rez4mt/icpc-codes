package com.Judges.uri;

import java.math.BigInteger;
import java.util.Scanner;

public class P1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a,b;
        while (sc.hasNext())
        {
            a = sc.nextLong();
            b = sc.nextLong();
            System.out.println(a ^ b);
        }

    }
}
