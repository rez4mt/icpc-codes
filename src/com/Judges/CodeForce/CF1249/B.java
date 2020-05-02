package com.Judges.CodeForce.CF1249;

import java.util.Scanner;

public class B {
    static int[] list;
    static int N ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        list = new int[201];
        while (T-->0)
        {
            N = sc.nextInt();

            for(int i = 0 ; i < N ; i++)
                list[i+1] = sc.nextInt();
            int[] costs = new int[N+1];
            for(int i = 1 ; i<=  N ; i++)
            {
                costs[i] = cost(i);
            }
            for(int i = 1; i <= N ; i++)
            {
                System.out.print(costs[i]+" ");
            }
            System.out.println();
        }
    }
    static int cost(int x)
    {
        int cost = 1 ;
        int p = list[x];
        while(p!=x)
        {
            cost++;
            p = list[x];
        }
        return cost;
    }
}
