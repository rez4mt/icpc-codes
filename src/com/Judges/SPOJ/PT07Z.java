package com.Judges.SPOJ;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class PT07Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph(sc.nextInt());
        sc.nextLine();
        while (sc.hasNext())
        {
            g.addEdge(sc.nextInt()-1,sc.nextInt()-1);
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < g.nv; i++)
        {
            max = Math.max(max,g.bfs(i));
        }
        System.out.println(max);

    }
    static class Graph{
        ArrayList<Integer>[] adj ;
        int nv;
        int[] distTo ;
        boolean[] marked ;

        public Graph(int n)
        {
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[n];
            for(int i = 0 ; i < n ; i++)
            {
                adj[i] = new ArrayList<>();
            }
            marked = new boolean[n];
            distTo = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                distTo[i] = Integer.MAX_VALUE;
            }
        }

        public void addEdge(int v1,int v2)
        {
            adj[v1].add(v2);
            adj[v2].add(v1);
        }

        int bfs(int n)
        {
            int max = Integer.MIN_VALUE;
            marked = new boolean[nv];
            ArrayDeque<Integer> q =new ArrayDeque<>();
            for(int i = 0 ; i < nv ; i++)
                distTo[i] = Integer.MAX_VALUE;
            q.add(n);
            distTo[n] = 0;
            marked[n] = true;
            while ( !q.isEmpty() )
            {
                int v = q.remove();
                for(int w : adj[v])
                {
                    if(!marked[w])
                    {
                        marked[w] = true;
                        distTo[w] = distTo[v]+1;
                        max = Math.max(distTo[w],max);
                        q.add(w);
                    }
                }
            }
            return max;
        }
    }
}
