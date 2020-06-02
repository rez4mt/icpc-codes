package com.Judges.CodeForce.CF123123123;
import java.util.*;
import java.io.*;

public class C {
    static PrintWriter pw ;
    public static void main(String[] args) throws Exception {
        fr sc = new fr();
        pw = new PrintWriter(System.out);

        int T = sc.nextInt();
        while (T-->0)
        {

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
