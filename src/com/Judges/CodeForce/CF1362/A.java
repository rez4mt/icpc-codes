package com.Judges.CodeForce. CF1362;
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
        long nextLong() throws IOException { return Long.parseLong(next()); }
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
            long a = sc.nextLong();
            long b = sc.nextLong();
            long tmp = Math.min(a,b) ;
            a =  Math.max(a,b);
            b = tmp;
            if(a==b)
            {
                println(0);
            }else if(a%b!=0)
            {
                println(-1);
            }else {
                long div = a / b;
                long count = 0;
                if(div%2==1)
                {
                    println(-1);
                }else {
                    boolean flag = true;

                    while (div > 1)
                    {
                        if(div%8== 0)
                        {
                            div/=8;
                            count++;
                        }else if(div%4==0)
                        {
                            div/=4;
                            count++;
                        }else if(div%2==0)
                        {
                            div/=2;
                            count++;
                        }else if(div%2==1)
                        {
                            flag = false;
                            break;
                        }
                    }
                    if(!flag)
                        println(-1);
                    else
                        println(count);
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