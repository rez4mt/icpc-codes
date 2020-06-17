package com.Judges.CodeForce.CF1359;
import java.util.*;
import java.io.*;

public class A {
    static PrintWriter pw ;
    public static void main(String[] args) throws Exception {
        fr sc = new fr();
        pw = new PrintWriter(System.out);

        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int m  =sc.nextInt();
            int k = sc.nextInt();
            int max_jokers = n/k;
            if(max_jokers >= m)
            {
                System.out.println(m);
                continue;
            }
            int rem = m - max_jokers;
            int max = (int)Math.ceil(rem / (k-1d));
            System.out.println(max_jokers - max);

        }
    }

    static class fr{
        BufferedReader br;
        StringTokenizer st;
        public fr(File f) throws Exception
        {
            br = new BufferedReader(new FileReader(f));
        }
        public fr()
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
        public long nextLong() throws Exception{
            return Long.parseLong(next());
        }
     }

}
