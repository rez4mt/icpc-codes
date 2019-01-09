package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U10929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String val = sc.next();
            BigInteger a = new BigInteger(val);

            if(a.compareTo(BigInteger.ZERO) == 0)
                break;
            if(a.mod(BigInteger.valueOf(11)).compareTo(BigInteger.ZERO) == 0)
            {
                System.out.printf("%s is a multiple of 11.\n",val);
            }else
                System.out.printf("%s is not a multiple of 11.\n",val);

        }
    }
}
