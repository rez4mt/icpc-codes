package com.Judges.UVA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class U924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            Graph g = new Graph(sc.nextInt());

        }
    }
    static class Graph{
        int nv;

        boolean[] marked;
        int[] distTo;
        int[] count ;
        ArrayList<Integer>[] adj;
        public Graph(int n)
        {
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[nv];
            for(int i = 0 ; i < n ; i++)
                adj[i] = new ArrayList<Integer>();
        }
        public void addEdge(int v1,int v2)
        {
            adj[v1].add(v2);
        }
        public void bfs(int n)
        {
            distTo = new int[nv];
            for(int i = 0 ; i < nv ;i++)
                distTo[i] = Integer.MAX_VALUE;
            marked = new boolean[nv];
            count = new int[nv];
            distTo[n] = 0;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(n);
            while (!q.isEmpty())
            {
                int v = q.remove();
                for (int w : adj[v])
                {
                    if(!marked[w])
                    {
                        marked[w] = true;
                        distTo[w] = distTo[v]+1;
                        q.add(w);
                    }
                }
            }
        }
    }
}
