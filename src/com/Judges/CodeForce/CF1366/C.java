package com.Judges.CodeForce. CF1366;
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
    public static void main(String[] args) throws Exception{
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        pw = new PrintWriter(System.out);
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp = Math.max(a,b);
            b = Math.min(a,b);
            a = tmp;
            int diff = Math.abs(a-b);
            if( diff <= a && diff <= b)
            {
                a -= 2*diff;
                b -= diff;
                System.out.println((diff*1l) +(a* 2 / 3 ) );
            }else
            {
                int max = 2*b;
                if ( max > a)
                {
                    System.out.println(a/2);
                }else
                {
                    System.out.println(b);
                }
            }
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
