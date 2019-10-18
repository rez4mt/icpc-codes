package com.AOU.ACPC.T2019;

import java.util.Scanner;

public class B {
    static boolean[] prime;
    private static void sieve(int n)
    {
        prime = new boolean[n+1];

        for (int i = 2; i< prime.length; i++) {
            prime[i] = true;
        }
        for (int i = 2; i< Math.sqrt(n); i++) {
            if(prime[i]) {
                for(int j = (i*i); j<n; j = j+i) {
                    prime[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if(p == 2)
        {
            System.out.println(-1);
            return;
        }
        sieve(p);
        if(prime[p-2])
            System.out.println("2 "+(p-2));
        else System.out.println("-1");

    }
}
