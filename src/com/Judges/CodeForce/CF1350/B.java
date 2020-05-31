package com.Judges.CodeForce. CF1350;
import java.util.*;
public class B {
    static         int[] prime;
    static HashSet<Integer>[] divs;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve(1000005);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int[] list = new int[n+1];
            for(int i = 1 ; i <= n ;i++)
                list[i] = sc.nextInt();
            int max =0 ;
            int[] dp =new int[n+1];
            for(int i = 1 ; i <= n ; i++)
                dp[i] = 1;

            for(int i = n ; i >=2 ; i--)
            {
                for (int di : divs[i]) {
                    int j = i/di;
                    if(list[i]>list[j])
                    {
                        dp[j] = Math.max(dp[j] ,dp[i]+1 );
                    }
                }
            }
            for(int i = 1 ; i <=n ; i++)
                max = Math.max(dp[i],max);
            System.out.println(max);
        }
    }

    static void sieve(int n)
    {

        prime = new int[n+1];
        divs = (HashSet<Integer>[]) new HashSet[n+1];

        for(int i=0;i<=n;i++)
        {
            prime[i] = -1;
            divs[i] = new HashSet<>();
        }

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            divs[p].add(p);
            if(prime[p] == -1)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                {
                    divs[i].add(p);
                    prime[i] = p;
                }
            }
        }

    }
}
