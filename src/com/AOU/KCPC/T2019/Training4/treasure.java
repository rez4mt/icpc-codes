//package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class treasure {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (new File("fractions.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            Graph g = new Graph(N+1);
            for(int i = 0 ; i < N-1 ; i++)
                g.addEdge(sc.nextInt(),  sc.nextInt());
            g.bfs();
            int count = 0 ;
            int current = 0 ;
            for(int i = 1 ; i <= N ; i++)
                if(g.distTo[i] == g.farest_dis)
                {
                    current = i;
                    count++;
                }
            if(count == 1)
                System.out.println(current);
            else System.out.println("it was a trap!");
        }
    }
    static class Graph {
        int farest_dis = 0 ;
        int farest_w = 0;
        ArrayList<Integer>[] adj;
        int[] distTo ;
        int[] dists ;
        boolean[] visited ;
        public Graph(int N) {
            adj = new ArrayList[N];
            for (int i = 0; i < N; i++)
                adj[i] = new ArrayList<>();
            distTo = new int[N];
            visited = new boolean[N];
            dists = new int[N];
        }
        public void addEdge(int w , int u)
        {
            adj[w].add(u);
            adj[u].add(w);
        }
        public void bfs()
        {
            ArrayDeque<Integer> deq = new ArrayDeque<>();
            deq.add(1);
            visited[1] = true;
            while (!deq.isEmpty())
            {
                int current = deq.remove();
                for (int w :
                        adj[current]) {
                    if(!visited[w])
                    {
                        distTo[w] = distTo[current]+1;
                        visited[w]= true;
                        if(distTo[w]>farest_dis)
                            farest_dis = distTo[w];

                        deq.add(w);
                    }
                }
            }
        }
    }
}
