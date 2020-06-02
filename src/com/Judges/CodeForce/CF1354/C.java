package com.Judges.CodeForce. CF1354;
import java.util.*;
import java.io.*;

public class C {
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
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        pw = new PrintWriter(System.out);
        while (T-->0)
        {
            int n = sc.nextInt();
            double rad = 1d / Math.cos(Math.toRadians(180d/(2*n)));
            System.out.println(1+rad);
           /* int triC = (n-2)/2;
            System.out.println(triC);*/

        }
        pw.flush();
    }
    static double round(double d)
    {
        return (double)Math.round(d * 100000d) / 100000d;
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
