package com.AOU.KCPC.T2019.Training1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class albert {
    static boolean[] prime ;
    static int MAX = (int)
             10e7 ;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("albert.in"));
        int T = sc.nextInt();
        sieve(MAX);
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            for(int i = 0 ; i < N; i++)
                list[i] = sc.nextInt();
            System.out.println(check(list));;
        }

    }

    public static int check(int[] A)
    {
        int[] L = new int[A.length];
        L[0] = 1;
        if(prime[A[0]])
            L[0] = 0;
        for (int i = 1; i < A.length; i++)
        {
            if(prime[A[i]])
                continue;
            for (int j = 0; j < i; j++)
            {
                if (A[j] <= A[i] && L[j] > L[i]) {
                    L[i] = L[j];
                }
            }
            L[i]++;
        }
        int mx = 0 ;
        for(int i = 0 ; i < A.length ;i++)
            mx = Math.max(L[i],mx);
        return mx;
    }


    private static void sieve(int n)
    {
        prime = new boolean[n+1];
        for(int i=1;i<n;i++)
            prime[i] = true;
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p])
            {
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        prime[1] = false;

    }
}
