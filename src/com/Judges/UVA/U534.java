package com.Judges.UVA;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class U534 {
    static boolean[] prime;
    static int MAX = 1000000;
    private static void sieve(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        prime = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
        int sqrt = (int)Math.sqrt(n);
        for(int p = 2; p<sqrt; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p])
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve(MAX);
        PrintWriter pw = new PrintWriter(System.out);
        while (true)
        {
            int n = sc.nextInt();
            if(n == 0)
                break;
            for(int i = 2 ; i <= MAX ; i++) {
                if(!prime[i])
                    continue;
                int num = n - i;
                if(prime[num])
                {
                    pw.printf("%d = %d + %d\n",n,i,num);
                    break;
                }
            }

        }
        pw.flush();
    }
}
