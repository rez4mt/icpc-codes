package com.Judges.CodeForce. CF1354;
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
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        pw = new PrintWriter(System.out);
        while (T-->0)
        {
            String s = sc.next();
            int n = s.length();
            int[] frq = new int[4];
            int k = 0 ;
            int len = n;
            boolean found = false;
            for(int i = 0 ,j = 0 ; i < n ; i++)
            {
                if(frq[s.charAt(i)-'0']++ == 0)
                    k++;
                if(k == 3)
                {
                    found = true;
                    while ( k == 3 &&j<i && frq[s.charAt(j)-'0']>1)
                    {
                        if(frq[s.charAt(j)-'0']--==1)
                            k--;
                        j++;
                    }
                    if(frq[s.charAt(j)-'0']==0)
                        k--;
                    len = Math.min(len , i-j+1);
                }

            }
            if(found)
                System.out.println(len);
            else
                System.out.println(0);
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
