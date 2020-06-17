package com.Judges.CodeForce. CF1365;
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
        int T = 1;
        pw = new PrintWriter(System.out);
        while (T-->0)
        {
            int n = sc.nextInt();
            HashMap<Integer , Integer> initial = new HashMap<>();
            for(int i = 0 ; i <  n ;i++)
                initial.put(sc.nextInt() , i );
            int[] frq = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                int a = sc.nextInt();
                int old_pos = initial.get(a);
                int move = ((old_pos - i) + n) % n  ;
                frq[move]++;
            }
            int mx = 0 ;
            for(int i = 0 ; i < n ;i++)
            {
                mx = Math.max(mx , frq[i]);
            }
            System.out.println(mx);
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
