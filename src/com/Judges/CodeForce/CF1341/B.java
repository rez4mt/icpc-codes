package com.Judges.CodeForce.CF1341;
import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n , k ;
            n = sc.nextInt();
            k = sc.nextInt();
            int[] list = new int[n];
            for(int i = 0 ; i < n ; i++)
                list[i] = sc.nextInt();
            int[] dp = new int[n+1];
            for(int i = 1 ; i < n-1 ; i++)
            {
                if(list[i-1] < list[i] && list[i+1]<list[i])
                    dp[i]++;
            }
            for(int i = 0 ; i < n ; i++)
                dp[i+1] += dp[i];
            int bestL = 0 ;
            int best = 0 ;
            for(int i = 0 ; i < n-k+1; i ++)
            {
                int r = i+k-1;
                if(dp[r-1]-dp[i] > best)
                {
                    bestL = i;
                    best = dp[r-1]-dp[i];
                }
            }
            System.out.println(best+1+" "+(bestL+1));
        }
    }
}