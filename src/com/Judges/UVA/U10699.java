package com.Judges.UVA;

import java.util.Scanner;

public class U10699 {
    static int MAX = 1000000+2;
    public static void main(String[] args) {
        int sqrt =(int) Math.sqrt(MAX);
        int[] factors = new int[MAX];
        factors[1] = 1;
        for(int i = 2;i < MAX ; i++)
        {
            if(factors[i] != 0)
                continue;
            for(int j = i;j < MAX;j+=i)
            {
                factors[j] ++;
            }
        }
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            System.out.printf("%d : %d\n",N,factors[N]);
        }
    }
}
