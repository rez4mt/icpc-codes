package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Scanner;

public class U10004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            int T = sc.nextInt();
            Graph g = new Graph(N);
            while (T-->0)
                g.addEdge(sc.nextInt(),sc.nextInt());

            for(int i = 0 ; i < g.nv && g.isBiparate;i++)
                g.dfs(i);
            System.out.println(g.isBiparate?"BICOLORABLE.":"NOT BICOLORABLE.");
        }
    }
    static class Graph{
        boolean isBiparate = true;

        int ne,nv;
        ArrayList<Integer>[] adj;

        boolean[] color ;
        boolean[] marked ;
        private int[] edgeTo;

        Graph(int n)
        {
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[nv];
            color = new boolean[n];
            marked = new boolean[n];
            edgeTo = new int[n];
            for (int i = 0; i < nv; i++)
                adj[i] = new ArrayList<Integer>();

        }
        void addEdge(int v1,int v2)
        {
            ne ++;
            adj[v1].add(v2);
            adj[v2].add(v1);
        }
        void dfs(int v)
        {
            marked[v] = true;
            if(!isBiparate)
                return;
            for (Integer w: adj[v]) {
                if(!marked[w])
                {
                    edgeTo[w] = v;
                    color[w] = !color[v];
                    dfs(w);
                }else if(color[w] == color[v])
                {
                    isBiparate = false;
                    return;
                }
            }
        }
    }
}
