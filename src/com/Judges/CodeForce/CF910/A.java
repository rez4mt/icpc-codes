package com.Judges.CodeForce.CF910;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        char[] path = sc.next().toCharArray();
        int[] dp = new int[n];
        dp[0] = 1;
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int i = 0 ; i <= d; i++)
            dp[i] =path[i]=='1'? 1:Integer.MAX_VALUE;
        for(int i = d+1 ; i < n ;i++)
        {
            for(int j =1 ; j <= d && i-j>=0; j++)
            {
                if(path[i] == '0')
                    dp[i] = Integer.MAX_VALUE;
                else dp[i] = dp[i-j] == Integer.MAX_VALUE?dp[i]:Math.min(dp[i],dp[i-j]+1);
            }

        }
        System.out.println(dp[n-1]==Integer.MAX_VALUE?-1:dp[n-1]);

    }
}
