package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class U1210 {
    public static void main(String[] args) throws Exception {
        int max = 10000;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        for (int i = 4; i <= max; i++) {
            boolean p = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    p = false;
                    break;
                }
            }
            if (p) {
                primes.add(i);
            }
        }
        int[] answers = new int[max+1];//including 0
        for (int startIndex = 0; startIndex < primes.size(); startIndex++) {
            int sum = 0;
            for (int currentIndex = startIndex; currentIndex < primes.size(); currentIndex++) {
                sum += primes.get(currentIndex);
                if (sum > max) break;
                answers[sum]++; // for each sum, how many times (the sum of n primes) made that sum.
            }
        }

        FastReader fs = new FastReader();
        while (true) {
            int a = fs.nextInt();
            if (a==0) return;
            System.out.println(answers[a]);
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
