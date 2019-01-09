package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String data = sc.next();
            int base = sc.nextInt();
            int output = sc.nextInt();
            String d = new BigInteger(data,base).toString(output).toUpperCase();
            if(d.length() > 7)
                d = "ERROR";
            System.out.printf("%7s\n",d);
        }
    }
}
