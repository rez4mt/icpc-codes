package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U10036 {

    static int[] list;
    static int[][] dp ;
    static int m ;
    static int k ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        list = new int[10000];
        dp = new int[10000][100];

        int T = sc.nextInt();

        while (T-->0)
        {
            m = sc.nextInt();
            k = sc.nextInt();
            for(int i = 0 ; i < m ;i++)
                list[i] = sc.nextInt();
            for(int i = 0 ; i < dp.length ; i++)
                Arrays.fill(dp[i] , -1);
            if(solve(0,0))
                System.out.println("Divisible");
            else
                System.out.println("Not divisible");
        }

    }
    static boolean solve(int rem , int idx)
    {
        if(idx == m)
            return rem == 0;
        if(dp[idx][rem]!=-1)
            return dp[idx][rem] == 1;

        if(solve((((rem+list[idx])%k)+k)%k,idx+1))
        {
            dp[idx][rem] = 1;
        }else if(solve((((rem-list[idx])%k)+k)%k,idx+1))
        {
            dp[idx][rem] = 1;
        }else {
            dp[idx][rem] = 0;
        }

        return dp[idx][rem] == 1;
    }
}
