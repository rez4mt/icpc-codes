package com.AOU.ACPC.T2019.T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class I {

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
        int N = sc.nextInt();
        long[] list = new long[N];
        for (int i = 0; i < N; i++)
            list[i] = sc.nextLong();
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        Arrays.sort(list);

        int r = 0;
        int l = list.length - 1;
        long[] dp = new long[N+10];
        int k = 2;
        boolean right = false;
        while (r < l) {
            if(k%2==0)
            {
                long diff = Math.abs(list[r] - list[l]);
                dp[k] = Math.abs(dp[k-2] - dp[k-1]) + diff + dp[k-1];
            }else
            {
                dp[k] = Math.abs(dp[k-2] - dp[k-1]) + dp[k-1];
            }

            sb.append(dp[k] + " ");

            k++;

            if (!right) {
                r++;
            } else l--;

            right = !right;
        }
        sb.deleteCharAt(sb.length() - 1);
        pw.println(sb.toString());
        pw.flush();
     }
}
