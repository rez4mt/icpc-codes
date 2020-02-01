package com.Judges.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class spiderman {

    static class FR{
        BufferedReader br;
        StringTokenizer st;
        public FR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() throws Exception
        {
            if(st == null || !st.hasMoreTokens())
            {
                st = new StringTokenizer(br.readLine());
                return next();
            }
            return st.nextToken();
        }
        public int nextInt() throws Exception
        {
            return Integer.valueOf(next());
        }
        public double nextDouble() throws Exception
        {
            return Double.parseDouble(next());
        }
    }

    static long max = Long.MAX_VALUE;
    static int[] list;
    static long[] dp ;
    static int N ;
    static int smax = -1;
    static StringBuilder sb ;
    static StringBuilder best ;
    public static void main(String[] args) throws Exception {
        FR sc = new FR();
        PrintWriter pw = new PrintWriter(System.out);
        int T = sc.nextInt();
        best = new StringBuilder();
        sb = new StringBuilder();
        list = new int[41];
        dp = new long[41];
        while (T-->0)
        {
            N = sc.nextInt();
            max = Long.MAX_VALUE;
            smax = -1;
            for(int i = 0 ; i < N ; i++)
            {
                list[i] = sc.nextInt();
                smax = Math.max(smax , list[i]);
            }
            dp[0] = list[0];
            for(int i = 1 ; i < N ; i++)
                dp[i] = dp[i-1]+list[i];
            if(dp[N-1]%2 == 1)
            {
                pw.println("IMPOSSIBLE");
                continue;
            }
            if(best.length()!=0)
            best.delete(0 , best.length());
            bt(0,0,0);
            if(best.length() != 0)
                pw.println(best);
            else pw.println("IMPOSSIBLE");
        }
        pw.flush();
    }
    private static void bt(int idx , int sum , int height)
    {
        if(max == smax)
            return ;
        if(idx >= N)
        {

            if(sum == 0)
            {
                if(height<max)
                {

                    //store it as best
                    best.delete(0,best.length());
                    best.append(sb);
                    max = height;
                }
            }
            return;
        }
        if(height >= max)
            return;
        if(idx>0 && dp[N-1]-dp[idx-1] < sum)
            return;

        //check if we can dec it
        if(sum < list[idx])
        {
            //dec it
            sb.append("U");
            bt(idx+1,sum+list[idx] ,Math.max(height , sum+list[idx]));
            sb.deleteCharAt(sb.length()-1);
        }else
        {
            sb.append("D");
            bt(idx+1 , sum-list[idx] , height);
            sb.deleteCharAt(sb.length()-1);
            sb.append("U");
            bt(idx+1 , sum+list[idx] , Math.max(height,sum+list[idx]));
            sb.deleteCharAt(sb.length()-1);

        }

    }
}
