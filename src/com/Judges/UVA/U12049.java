package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U12049 {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int T = fr.nextInt();
        while (T-->0)
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            int n = fr.nextInt();
            int m = fr.nextInt();
            for(int i = 0 ; i < n ; i++)
            {
                int a = fr.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }

            for(int i = 0 ; i < m ; i++)
            {
                int a = fr.nextInt();
                map.put(a,map.getOrDefault(a,0)-1);
            }
            int count = 0;
            for (int a :
                    map.keySet()) {
                count += Math.abs(map.get(a));
            }
            System.out.println(count);
        }
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
