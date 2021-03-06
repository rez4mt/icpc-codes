package com.Judges.CodeForce.CF919;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        char[][] mat = new char[n][];
        for(int i = 0 ; i < n ;i++)
            mat[i] = sc.next().toCharArray();
        int count = 0 ;
        int[][] dp = new int[n][m];
        dp[0][0] = mat[0][0] =='*'?0:1;

        for(int i = 1 ; i < m ;i++)
        {
            dp[0][i] = dp[0][i-1] + mat[0][i]=='*'?0:1;

        }
        for(int i = 1 ; i < n ; i++)
        {
            dp[i][0] = dp[i-1][0] + mat[i][0]=='*'?0:1;
        }
        for(int i = 1 ; i < n ; i++)
        {
            for(int j = 1 ; j < m ; j++)
            {
                dp[i][j] =  mat[i][j]=='*'?0:1+  (dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1]) ;
            }
        }
        print(dp);
        for(int i = 0 ; i <= n-k ; i++)
        {
            for(int j = 0 ; j <= m-k ; j++)
            {
                int c = dp[i+k][j] - dp[i][j];
                int c2 = dp[i][j+k] - dp[i][j];
                if(c==k)
                    count++;
                if(c2 == k)
                    count++;
            }
        }
        System.out.println(count);
    }
    private static void print(int[][] map)
    {
        for(int i = 0 ; i < map.length ;i++)
        {
            for(int j = 0 ; j < map[i].length;j++)
                System.out.printf("%3d ",map[i][j]);
            System.out.println();
        }
    }
}
