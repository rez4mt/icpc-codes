package com.Judges.CodeForce. CF1363;
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
    public static void main(String[] args)  throws Exception{
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        pw = new PrintWriter(System.out);
        while (T-->0)
        {
            char[] s = sc.next().toCharArray();
            if(s.length<2)
            {
                println(0);
            }else {
                int n  = s.length;
                long ans= 0 ;
                for(int i = 0 ; i <n;i++)
                {
                    if(i!=n-1 && s[i]!=s[(i+1)])
                    {
                        int j = i+1;
                        while (j<n && s[j]!=s[i])
                            j++;
                        if(j==n)
                            break;
                        int betlen = j-i-1;
                        if(betlen < i && betlen<n-j)
                        {

                        }


                    }
                }
                System.out.println(ans);


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
