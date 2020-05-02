package com.Judges.CodeForce.CF1334;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class C {
    public static void main(String[] args) throws Exception {
        FR sc = new FR();
        //Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int T = sc.nextInt();
        while (T-->0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextLong();
                b[i] = sc.nextLong();
            }
            long[] pre = new long[n];
            long rem = 0 ;
            for(int i = 0 ; i < n -1 ; i++)
            {
                pre[i+1] = Math.max(0 , a[i+1] - b[i]);
                rem += pre[i+1];
            }
            pre[0] = Math.max( 0 , a[0] - b[n-1]);
            rem+=pre[0];
            //System.out.println(Arrays.toString(a));
            //System.out.println(Arrays.toString(pre));
            long min = (long) 1e13;
            for(int i = 0 ;  i < n ; i++)
                min = Math.min(min , a[i] - pre[i]);
            //System.out.println(min);
            pw.println(rem+min);
        }
        pw.flush();
    }


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
                return Integer.parseInt(next());
            }
            public long nextLong() throws Exception
            {
                return Long.parseLong(next());
            }
            public double nextDouble() throws Exception
            {
                return Double.parseDouble(next());
            }
        }
}
