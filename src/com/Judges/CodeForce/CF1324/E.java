package com.Judges.CodeForce.CF1324;

import java.util.*;

public class E {
    static int n;
    static int h;
    static int l;
    static int r;
    static int[] list = new int[2001];
    static int[][] dp = new int[2001][2001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();
        for(int i = 0 ; i < 2001;i++)
            for(int j = 0 ; j < 2001;j++)
                dp[i][j] = -1;
        for(int i = 0 ; i<n ; i++)
            list[i] = sc.nextInt();
        System.out.println(check(0,0));
    }
    private static int check(int idx , int t)
    {
        if(idx == n)
            return 0;
        if(dp[idx][t]!=-1)
            return dp[idx][t];
        int res = 0;
        //t and t-1
        int tt = (t + list[idx]) % h;
        int tt2 = (tt -1 +h)%h;
        res=  Math.max(res ,(tt>=l && tt<=r?1:0) + check(idx+1 , tt));
        res = Math.max(res ,(tt2>=l && tt2<=r?1:0) +  check(idx+1 , tt2));
        dp[idx][t] = res;
        return res;
    }


}
