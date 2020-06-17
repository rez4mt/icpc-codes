package com.Judges.CodeForce. CF1366;
import java.util.*;
import java.io.*;

public class B {
    static PrintWriter pw ;
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { // To read from the standard input
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        // You can add a constructor to read from a file
        /////
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        String nextLine() throws IOException { return br.readLine(); }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        //You can add nextDouble() etc...
        boolean hasNext() throws IOException { // if input is terminated by EOF
            String s = br.readLine();
            if (s == null) return false;
            st = new StringTokenizer(s);
            return true;
        }
    } //end FastReader
    public static void main(String[] args) throws Exception{
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        pw = new PrintWriter(System.out);
        while (T-->0)
        {
            int n = sc.nextInt();
            int x =  sc.nextInt();
            int m = sc.nextInt();
            int l = x;
            int r = x;
            while (m-->0)
            {
                int cl = sc.nextInt();
                int cr = sc.nextInt();
                if( l >= cl && l <= cr)
                {
                    l = Math.min(cl,l);
                }
                if( r <= cr && r >=cl)
                {
                    r = Math.max(cr,r);
                }
            }
            System.out.println(Math.abs(r-l)+1);
        }
        pw.flush();
    }
     private static void print(Object o)
     {
         pw.print(o);
     }
     private static void println(Object o)
     {
         pw.println(o);
     }
}
