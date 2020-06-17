package com.Judges.CodeForce. CF1363;
import java.util.*;
import java.io.*;

public class A {
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
            int n  = sc.nextInt();
            int x = sc.nextInt();
            int odd_c = 0;
            int ev_c = 0 ;
            for(int i = 0 ; i <n ;i++)
                if(sc.nextInt()%2 ==1)
                    odd_c++;
                else ev_c++;
                //
            if(odd_c==0)
            {
                println("NO");
            }else
            {
                if(x%2==0)
                {
                    if(odd_c>=x)
                    {
                        if(ev_c!=0)
                            println("YES");
                        else
                        {
                            println("NO");
                        }
                    }else
                    {
                        if(odd_c%2==1)
                        {
                            println("YES");
                        }else if(odd_c-1+ev_c>=x)
                        {
                            println("YES");
                        }else
                        {
                            println("NO");
                        }
                    }

                }else {
                    if (odd_c>=x){
                        println("YES");
                    }else if(odd_c%2==1)
                    {
                        println("YES");
                    }else if(ev_c!=0 && odd_c-1+ev_c>=x)
                    {
                        println("YES");
                    }else
                    {
                        println("NO");
                    }
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
