package com.ICPC.KCPC.K2019;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();

            ArrayList<Integer>[] adj = new ArrayList[N+1];
            for(int i = 0 ; i < N+1 ; i++)
                adj[i] = new ArrayList<>();
            //read path values
            int[] values = new int[N+1];
            for(int i = 1 ; i < N+1 ; i++)
                values[i] = sc.nextInt();
            //read connections
            for(int i = 0 ; i < N-1 ; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }

        }
    }
}
