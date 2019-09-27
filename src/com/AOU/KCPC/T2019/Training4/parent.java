package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class parent {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("fractions.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            G graph = new G(N+1);
            for(int i = 0 ; i < N -1 ; i++)
                graph.addEdge(sc.nextInt(),  sc.nextInt());
            graph.dfs(1);
            int Q = sc.nextInt();
            for(int i = 0 ; i < Q ; i++)
            {
                int s = sc.nextInt();
                int e = sc.nextInt();
                if(graph.time[s][0]<=graph.time[e][0] && graph.time[s][1]>=graph.time[e][1])
                    System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
    static class G{
        int intime = 0;
        int N ;
        boolean[] visited = new boolean[N];
        ArrayList<Integer>[] adj ;
        int[][] time ;
        public G(int N)
        {
            adj = new ArrayList[N];
            for(int i = 0;  i < N ; i++)
                adj[i] = new ArrayList<>();
            visited = new boolean[N];
            time = new int[N][2];
        }
        public void addEdge(int v , int u)
        {
            adj[v].add(u);
            adj[u].add(v);
        }
        public void dfs(int n)
        {
            visited[n] = true;
            time[n][0] = ++intime;
            for (int w : adj[n]) {
                if (!visited[w]) {
                    dfs(w);
                }
            }
            time[n][1] = ++intime;
        }
    }
}
