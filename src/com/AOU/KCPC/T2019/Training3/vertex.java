package com.AOU.KCPC.T2019.Training3;

import java.util.ArrayList;
import java.util.Scanner;

public class vertex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            Graph g = new Graph(N);
            for(int i = 0 ; i < N -1 ; i++)
                g.addEdge(sc.nextInt()-1,sc.nextInt()-1);
            for(int i = 0 ; i < M ; i++)
            {
                int op = sc.nextInt();
                if(op == 1)
                {
                    System.out.println(g.values[sc.nextInt()-1]);
                }else if(op == 2)
                {
                    g.add(sc.nextInt()-1 , sc.nextInt());
                }
            }
        }
    }
    static class Graph{
        ArrayList<Integer>[] adj ;
        int[] values ;
        public Graph(int N)
        {
            adj = new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
                adj[i] = new ArrayList<>();
            values = new int[N];

        }
        public void addEdge(int v , int u)
        {
            adj[v].add(u);
            adj[u].add(v);
        }
        public void add(int u , int x)
        {
            //values[u]+=x;
            for (int w :
                    adj[u]) {
                values[w] += x;
            }
        }

    }
}
