package com.Judges.UVA;

import java.io.PrintWriter;
import java.util.Scanner;

public class U524 {
    static boolean[] used = new boolean[20];
    static boolean[] prime;
    static int[] mlist ;

    static int N ;
    static PrintWriter pw;
    private static void sieve(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        prime = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
        for(int p = 2; p*p <=n; p++)
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
        sieve(32);
        pw = new PrintWriter(System.out);
        int c = 1;
        mlist = new int[17];
        mlist[0] = 1;
        while (sc.hasNext())
        {
            if(c!=1)
                pw.println();
            pw.printf("Case %d:\n",c++);
            N = sc.nextInt();
            for(int i = 0 ; i < N ; i++)
                used[i] = false;
            solve(1);
        }
        pw.flush();
    }
    private static boolean isPrime(int number)
    {
        return prime[number];
    }
    private static boolean solve(int index)
    {
        if(index == N)
        {
            if(isPrime(mlist[N-1]+1))
            {
                //print it
                print();
            }
        }else
        {
            for(int i = 2 ; i <= N ; i++)
            {
                if(used[i]) continue;
                if(isPrime(i+mlist[index-1]))
                {
                    mlist[index] = i;
                    used[i] = true;
                    solve(index+1);
                    used[i] = false;
                }
            }
        }
        return false;
    }
    private static void print()
    {
       pw.print(mlist[0]);
        for(int i = 1 ; i < N;i++)
        {
            pw.printf(" %d",mlist[i]);
        }
        pw.println();
    }
}
