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
            String s = sc.next();
            long sum = 0;
            for(int i = 0 ; i < s.length() ;i ++)
            {
                sum +=seg[Integer.valueOf(Character.toString(s.charAt(i)))];
            }
            System.out.printf("%d leds\n",sum);
        }
    }
}
