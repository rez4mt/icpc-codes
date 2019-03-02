package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U10718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(BigInteger.valueOf(a).toString(2));
            System.out.println(BigInteger.valueOf(b).toString(2));
            System.out.println(BigInteger.valueOf(c).toString(2));
            System.out.println(new BigInteger("111110",2).toString());
        }
    }
}
