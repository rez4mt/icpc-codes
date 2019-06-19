package com.Judges.a2;

import java.util.Scanner;

public class A157 {
    static int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(m == n && n == -1)
                break;
            long[][] mat = new long[n+1][m+1];
            for(int i = 0 ; i <= n ;i++)
                mat[i][0] = 1;
            for(int j = 0 ; j <= m; j++)
                mat[0][j] = 1;
            for(int i = 1 ; i <= n;i++)
            {
                for(int j = 1 ; j<=m;j++)
                {
                    mat[i][j] = (mat[i-1][j]+ mat[i][j-1]) % MOD;
                }
            }
            System.out.println(mat[n][m]);
        }
    }
}
