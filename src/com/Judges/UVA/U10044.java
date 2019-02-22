package com.Judges.UVA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class U10044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();
            Graph g = new Graph(N*2);
            for(int i = 0 ; i < N ; i++)
            {
                String l = sc.nextLine();
                
            }
        }
    }

    static class Graph{
        int nv;
        ArrayList<Integer>[] adj;
        int[] distTo ;
        boolean[] marked ;
        public Graph(int N)
        {
            nv = N;
            adj = (ArrayList<Integer>[]) new ArrayList[N];
            for (int i = 0; i < N; i++)
                adj[i] = new ArrayList<>();
            marked = new boolean[N];
            distTo = new int[N];
        }
        public ArrayList<Integer> adj(int n)
        {
            return adj[n];
        }
        public void addEdge(int v1,int v2)
        {
            adj(v1).add(v2);
            adj(v2).add(v1);
        }

        public void bfs(int n)
        {
            ArrayDeque<Integer> q = new ArrayDeque<>();
            for(int i = 0 ; i < nv ; i ++)
                distTo[i] = Integer.MAX_VALUE;
            distTo[n] = 0;
            marked[n] = true;
            q.add(n);
            while (!q.isEmpty())
            {
                int temp = q.remove();
                for (int w : adj(temp)) {
                    if (!marked[w])
                    {
                        distTo[w] = distTo[temp]+1;
                        marked[w] = true;
                        q.add(w);
                    }
                }
            }
        }
    }
}
