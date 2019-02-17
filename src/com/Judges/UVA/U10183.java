package com.Judges.UVA;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class U10183 {
    static ArrayList<BigInteger> fibs = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        FastReader fs = new FastReader();
        BigInteger a;
        BigInteger b;
        fibs.add(new BigInteger("1"));
        fibs.add(new BigInteger("1"));
        fibs.add(new BigInteger("2"));
        fibs.add(new BigInteger("3"));
        fibs.add(new BigInteger("5"));
        fibs.add(new BigInteger("8"));

        while (true) {
            a = fs.nextBig();
            b = fs.nextBig();
            if (a.compareTo(BigInteger.ZERO) == 0 && b.compareTo(BigInteger.ZERO) == 0) return;
            int first = firstIndex(a);
            int ans = between(first, b);
            System.out.println(ans);
        }
    }

    static BigInteger fibOf(int n) {
        if (fibs.size() >= n) {
            return fibs.get(n-1);
        } else {
            BigInteger bi = fibOf(n-1).add(fibOf(n - 2));
            fibs.add(bi);
            return bi;
        }
    }
    static int firstIndex(BigInteger n) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (fibOf(i).compareTo(n) >= 0) {
                return i;
            }
        }
        return -1;
    }
    static int between(int a, BigInteger b) {
        HashSet<BigInteger> hs = new HashSet<>();
        for (int i = a; i < Integer.MAX_VALUE; i++) {
            if (fibOf(i).compareTo(b) >= 0) {
                if (fibOf(i).compareTo(b) == 0 && fibs.contains(b)) hs.add(fibOf(i));
                break;
            } else {
                hs.add(fibOf(i));
            }
        }
        return hs.size();
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
        BigInteger nextBig() throws IOException { return new BigInteger(next()); }

        //You can add nextDouble() etc...
        boolean hasNext() throws IOException { // if input is terminated by EOF
            String s = br.readLine();
            if (s == null) return false;
            st = new StringTokenizer(s);
            return true;
        }
    } //end FastReader
}