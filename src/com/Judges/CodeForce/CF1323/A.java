package com.Judges.CodeForce.CF1323;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc .nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            boolean flag = false;
            for(int i = 0 ; i < N ;i++)
            {
                list[i] = sc.nextInt();
                if( list[i]%2 == 0)
                {
                    if(!flag)
                    {
                        System.out.println(1);
                        System.out.println(i+1);
                        flag = true;
                    }
                }
            }


            if(!flag)
            {
                int[] dp = new int[N];
                dp[0] = list[0];
                for(int i = 1 ; i< N ; i++)
                    dp[i] = list[i]+dp[i-1];
                for(int i = 0 ; i < N;i++)
                {
                    if(flag)
                        break;
                    if(dp[i]%2==0)
                    {
                        System.out.println(i+1);
                        System.out.println(1+" "+(i+1));
                        flag = true;
                        break;
                    }

                    for(int j = i+1  ; j < N ; j++)
                    {

                        if((dp[j]-dp[i])%2==0)
                        {
                            System.out.println(j-i);
                            flag = true;
                            System.out.println((i+1)+" "+(j+1));
                            break;
                        }
                    }
                }
            }
            if(!flag)
                System.out.println("-1");
        }
    }
}