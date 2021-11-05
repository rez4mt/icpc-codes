package com.Judges.CodeForce.CF230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B {

    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        sieve((int) 10e6);
        // prepare the set that calculates t primes
        HashSet<Long> tPrimes = new HashSet<>();
        for (int i = 2; ((long) i) * i <= 10e12; i++) {
            if (prime[i])
                tPrimes.add((long) i * i);
        }
        while (N-- > 0) {
            long number = Long.parseLong(st.nextToken());
            if (tPrimes.contains(number))
                pw.println("YES");
            else pw.println("NO");
        }

        pw.flush();
    }

    private static void sieve(int n) {
        prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        int sqrt = (int) Math.sqrt(n);
        prime[2] = true;
        prime[3] = true;
        prime[5] = true;
        for (int p = 4; p <= sqrt; p += 2) {
            prime[p] = false;
        }
        for (int p = 3; p <= n; p += 2) {
            if (prime[p]) {
                for (long i = (long) p * p; i <= n; i += p) {
                    prime[(int) i] = false;
                }
            }
        }
    }
}
