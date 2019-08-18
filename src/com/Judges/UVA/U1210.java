package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class U1210 {
    public static void main(String[] args) throws Exception {
        int max = 10000+1;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        for (int i = 5; i <= max; i+=2) {
            boolean p = true;
            int sqrt =(int) Math.sqrt(i);
            for (int j = 2; j<= sqrt; j++) {
                if (i % j == 0) {
                    p = false;
                    break;
                }
            }
            if (p)
                primes.add(i);
        }
        int[] ans = new int[max];
        for(int i = 0 ; i< primes.size();i++)
        {
            int sum = 0;
            for(int j = i; j < primes.size();j++)
            {
                sum+=primes.get(j);
                if(sum>max)
                    break;
                ans[sum] ++;
            }
        }
        FastReader fs = new FastReader();
        while (true) {
            int a = fs.nextInt();
            if (a==0) return;
            System.out.println(ans[a]);
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
