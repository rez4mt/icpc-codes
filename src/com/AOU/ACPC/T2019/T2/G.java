package com.AOU.ACPC.T2019.T2;

import com.ICPC.KCPC.K2019.Array;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dp = new long[N+1];

        for(long i = 1 ; i <= N ;i++)
            dp[(int)i] = i*(i-1) + dp[(int)(i-1)];
        System.out.printf("%.10f\n", new BigDecimal(dp[N]).divide(BigDecimal.valueOf(N),10,RoundingMode.CEILING).doubleValue());
    }

}
