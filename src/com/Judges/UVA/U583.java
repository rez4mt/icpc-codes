package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Arrays;

public class U583 {
    static ArrayList<Integer> primes;
    static int MAX = (int)10e7;
    public static void sieve(int limit) {
        int crosslimit = (int) Math.sqrt(limit);
        boolean[] sieve = new boolean[limit+1];
        primes = new ArrayList<Integer>(Arrays.asList(2));

        for (int n = 4; n <= limit; n += 2) {   // mark even mumbers > 2
            sieve[n] = true;
        }

        for (int n = 3; n <= crosslimit; n += 2) {
            if (!sieve[n]) {
                for (int m = n*n; m <= limit; m += 2*n) {
                    sieve[m] = true;
                }
            }
        }

        for (int i = 3; i <= limit; i += 2) {
            if (!sieve[i]) {
                primes.add(i);
            }
        }

    }

    public static void main(String[] args) {

    }

}
