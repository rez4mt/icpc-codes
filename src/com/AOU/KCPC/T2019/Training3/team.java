//package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class team {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("team.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N  = sc.nextInt();
            int M  = sc.nextInt();
            Graph g = new Graph(N);
            for(int i = 0 ; i < M ; i++)
                g.addEdge(sc.nextInt()-1,sc.nextInt()-1);
            boolean dfs = true;
            for(int i = 0 ; i < N ; i++)
            {
                if(!g.visited[i])
                {
                    dfs = g.dfs(i);
                    if(!dfs)
                        break;
                }
            }
            if(!dfs)
                System.out.println("NO");
            else System.out.println("YES");

        }
    }
    static class Graph{
        ArrayList<Integer>[] adj ;
        boolean[] visited ;
        boolean[] color ;
        public Graph(int N)
        {
            adj = new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
            {
                adj[i] = new ArrayList<>();
            }
            color = new boolean[N];
            visited = new boolean[N];

        }
        public void addEdge(int v , int w)
        {
            adj[w].add(v);
            adj[v].add(w);
        }
        public boolean dfs(int v) {
            visited[v] = true;
            boolean d = true;
            for (int w : adj[v]) {
                if (!visited[w]) {
                    visited[w] = true;
                    color[w] = !color[v];
                    d = dfs(w);
                    if(!d)
                        return false;
                } else if (color[w] == color[v]) {
                    return false;
                }
            }

            return d;
        }

    }
}
