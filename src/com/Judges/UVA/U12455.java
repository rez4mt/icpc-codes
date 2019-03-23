package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class U12455 {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int T = fr.nextInt();
        while (T-->0)
        {
            int N = fr.nextInt();
            int P = fr.nextInt();
            int[] bars = new int[P];
            for(int i = 0 ; i < P;i++)
                bars[i] = fr.nextInt();
            long ways = 1<<P;
            boolean flag = false;
            for(int i = 1 ; i < ways && !flag;i++)
            {
                int sum = 0;
                for(int j = 0 ; j < P ;j++)
                {
                    if(( i & (1<<j)) !=0 )
                        sum+= bars[j];
                    if(sum == N)
                    {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag)
                pw.println("YES");
            else pw.println("NO");
        }
        pw.flush();
    }
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

}
