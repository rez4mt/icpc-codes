package com.Judges.CodeForce.CF1315;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            String s= sc.next();
            long[] dp =new long[s.length()+1];
            dp[s.length()] = s.charAt(s.length()-1)=='A'?a:b;
            for(int i = s.length()-1;i>0 ;i--)
            {
                if(s.charAt(i-1) == s.charAt(i))
                {
                    dp[i] = dp[i+1];
                    continue;
                }
                if(s.charAt(i-1)=='A')
                {
                    dp[i] = a+ dp[i+1];
                }
                else dp[i] = b+dp[i+1];
            }
            boolean flag = false;
            for(int i = 1 ; i<s.length()+1;i++)
            {
                if(dp[i]<=p || (s.length()>=2&&s.charAt(s.length()-1)!=s.charAt(s.length()-2)&&
                        dp[i]-dp[s.length()]<=p
                ))
                {
                    flag = true;
                    System.out.println(i);
                    break;
                }
            }
            if(!flag)
                System.out.println(s.length());
        }
    }
}
