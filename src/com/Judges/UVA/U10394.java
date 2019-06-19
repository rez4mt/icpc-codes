package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class U10394 {
    static boolean[] prime;

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

    public static void main(String[] args) throws IOException {
        int MAX = 2* (int)10e7;
        sieve(MAX);
        PrintWriter pw = new PrintWriter(System.out);
        String line ;
        int index = 0;
        int[][] pairs = new int[100002][2];
        for(int i = 2 ; i < MAX ; i++)
        {
            if(index > 100001)
                break;
            if(prime[i] && prime[i+2])
                pairs[index++] = new int[]{i,i+2};


        }
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (sc.hasNext())
        {
            int current =sc.nextInt()-1;
            pw.printf("(%d, %d)\n",pairs[current][0],pairs[current][1]);
        }
        pw.flush();
    }
}
