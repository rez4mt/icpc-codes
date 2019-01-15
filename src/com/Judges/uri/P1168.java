package com.Judges.uri;

import java.math.BigInteger;
import java.util.Scanner;

public class P1168 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int T = sc.nextInt();
        int[] seg = {6,2,5,5,4,5,6,3,7,6};
        while (T-->0)
        {
            BigInteger s = sc.nextBigInteger();
            long sum = 0;
            if(s.compareTo(BigInteger.ZERO) == 0)
            {
                System.out.println(seg[0]);
                continue;
            }
            while (s.compareTo(BigInteger.ZERO)>0)
            {
                sum += seg[s.mod(BigInteger.TEN).intValue()];
                s = s.divide(BigInteger.TEN);
            }
            System.out.printf("%d leds\n",sum);
        }
    }
}
