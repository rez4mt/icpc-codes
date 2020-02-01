package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class U11504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =  sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            Graph g = new Graph(N);
            int M = sc.nextInt();
            while (M-->0)
            {
                int p = sc.nextInt();
                int q = sc.nextInt();
                g.addEdge(p-1,q-1);
            }
            int count = 0 ;
            for(int i = 0 ; i < N ; i++)
            {
                if(!g.visited[i])
                {
                    count++;
                    g.dfs(i);
                }
            }
            System.out.println(count);
        }
    }
    static class Graph{
        ArrayList<Integer>[] adj;
        boolean[] visited ;
        public Graph(int N)
        {
            adj = new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
                adj[i] = new ArrayList<>();
            visited = new boolean[N];

        }
        public void addEdge(int u , int w)
        {
            adj[u].add(w);
            adj[w].add(u);
        }
        public void dfs(int s)
        {
            visited[s] = true;
            for (int e : adj[s])
            {
                if(!visited[e])
                {
                    dfs(e);
                }
            }
        }
    }
}
