package com.AOU.ACPC.T2019.T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class D {
     static class FastReader {
             BufferedReader br;
             StringTokenizer st;
             FastReader() throws Exception{ // To read from the standard input
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
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] flist = new int[a];
        for(int i = 0 ; i < a ; i++)
            flist[i] = sc.nextInt();
        int gcd = sc.nextInt();
        for(int i = 1 ; i < b ;i++)
        {
            gcd = GCD(gcd , sc.nextInt());
        }
        int rem = flist[0] % gcd;
        for(int i = 1 ; i < a ; i++)
        {
            if(rem!= flist[i]%gcd)
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static int GCD(int a, int b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }
}
