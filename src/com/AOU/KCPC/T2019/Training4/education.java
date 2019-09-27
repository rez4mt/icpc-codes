//package com.AOU.KCPC.T2019.Training4;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class education {

    public static boolean isPrime(int number) {
        if (number == 2) return true;
        if (number < 2 || number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2)
            if (number % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws Exception  {


        FastReader fs = new FastReader();
        int T = fs.nextInt();
        while (T-->0) {
            int N = fs.nextInt();
            int[] love = new int[N];
            for (int i = 0; i < N; i++) {
                love[i] = fs.nextInt();
            }
            int max = 0;
            int ia = 0;
            int a = 0;
            int ib = 0;
            int b = 0;

            for (int i = 0; i < N; i++) {
                for (int j = i+1; j < N; j++) {
                    int li = love[i];
                    int lj = love[j];
                    int sum = li + lj;
                    if ( isPrime(sum) && sum >= max) {
                        if (sum == max) {
                            if (i < ia || (i == ia && j < ib)) {
                                ia = i;
                                a = li;
                                ib = j;
                                b = lj;
                                max = sum;
                            }
                        } else {
                            ia = i;
                            a = li;
                            ib = j;
                            b = lj;
                            max = sum;
                        }
                    }
                }
            }

            if (max == 0) {
                System.out.println("Azuz is sad");
            } else {
                System.out.println((ia + 1) + " " + (ib + 1));
            }

        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() throws Exception{ // To read from the standard input
            br = new BufferedReader(new FileReader("waifus.in"));
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
}


