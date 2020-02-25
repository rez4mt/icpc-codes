package com.Judges.UVA;
import java.io.PrintWriter;
import java.util.*;

import java.io.PrintWriter;
import java.util.*;

public class U11504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =  sc.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
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
            int c =  0;
            for(int i = 0 ; i < N ; i++)
            {
                if(!g.visited[i])
                    g.dfs(i);
            }
            Collections.reverse(g.list);
            Arrays.fill(g.visited, false);
            for(int i = 0 ; i < g.list.size(); i++)
            {
                int item = g.list.get(i);
                if(!g.visited[item])
                {
                    c++;
                    g.dfs(item);
                }
            }
            //do topological sort.
            //reverse post order
            pw.println(c);
        }
        pw.flush();
    }
    static class Graph{
        ArrayList<Integer> list ;
        ArrayList<Integer>[] adj;
        boolean[] visited ;
        int[] indeg ;
        public Graph(int N)
        {
            list = new ArrayList<Integer>();
            adj = new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
                adj[i] = new ArrayList<>();
            visited = new boolean[N];
            indeg = new int[N];

        }
        public void addEdge(int u , int w)
        {
            adj[u].add(w);
            indeg[w] ++ ;
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
            list.add(s);
        }
    }
}