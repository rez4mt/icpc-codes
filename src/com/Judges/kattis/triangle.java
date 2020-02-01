package com.Judges.kattis;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println(Math.log10(Math.pow(3, 100) * (1-Math.pow(0.5, 100+1) *2)));
        int K = 1;
        while (sc.hasNext())
        {
            int N = sc.nextInt();
            BigDecimal dec = BigDecimal.ZERO;
            int ans = 0;
            for(int i = 0 ; i <= N ; i++)
            {
                double max = Math.max(3 , Math.pow(3,i));
                ans += (int) ((i*Math.log10(.5d))+Math.log10(max));
            }
            String s = sc.toString();
            int n = 0;
            for(int i = 0 ; i < N ; i++) {
                n++;
                if (s.charAt(i) == '.')
                    break;
            }
            System.out.println(n);

        }
    }
}
