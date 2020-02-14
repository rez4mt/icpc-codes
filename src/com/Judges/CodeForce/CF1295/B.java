package com.Judges.CodeForce.CF1295;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int x = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            int[] dp = new int[s.length()];

            int zeros = 0 ;
            int ones = 0;
            for(int i = 0 ; i <  N ; i++)
            {
                if(s.charAt(i)=='0')
                    zeros++;
                else if(s.charAt(i)=='1')
                    ones++;
                dp[i] =zeros - ones;
            }
            int ans = 0 ;
            if(x == 0)
                ans++;
            int rem =dp[N-1]==0?-1: x % dp[N-1];
            for(int i  = 0 ; i < N ; i++)
            {
                if(dp[i] == x ||(dp[N-1]!=0 && dp[N-1]>0==x>0 &&  Math.abs(dp[i]) == rem)) {
                    ans++;
                }
            }
            if(dp[N-1]==0)
            {
                if(dp[N-1] == x)
                    System.out.println(-1);
                else System.out.println(ans);
                continue;
            }
            ans = 0 ;
            if(x == 0)
                ans++;
            for(int i = N-1 ; i >=0 ; i--)
            {
                if((x-dp[i]) %dp[N-1] == 0 )
                {
                    if(( (dp[N-1] < 0 && x<0) || (dp[N-1] > 0 && x>0)))
                        ans++;
                }
            }

            System.out.println(ans);


        }
    }
}