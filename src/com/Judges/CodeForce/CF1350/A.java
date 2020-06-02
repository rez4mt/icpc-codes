package com.Judges.CodeForce. CF1350;
import java.util.*;
public class A {
    static         int[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sieve(1000005);
        while (T-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n%2==0)
            {
                System.out.println(1l*n + (k*2));
            }else
            {
                if(prime[n]==-1)
                {
                    long v =n+0l+n;
                    System.out.println(v+( ((k-1)*2l)));
                }else
                {
                    long v = n+prime[n];
                    System.out.println(v + (k-1)*2);
                }
            }
        }
    }


    static void sieve(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        prime = new int[n+1];
        for(int i=0;i<n;i++)
            prime[i] = -1;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == -1)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    if(prime[i]==-1)
                        prime[i] = p;
            }
        }

    }
}
