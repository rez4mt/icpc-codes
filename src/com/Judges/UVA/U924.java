package com.Judges.UVA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class U924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NE = sc.nextInt();
        Graph g = new Graph(NE);
        for(int i = 0 ; i < NE;i++)
        {
            //num of emps
            int N = sc.nextInt();
            for(int j = 0 ; j < N;j++)
            {
                //
                g.addEdge(i,sc.nextInt());
            }

        }
        int N = sc.nextInt();
        for(int j = 0 ; j < N ; j++)
        {
            g.bfs(sc.nextInt());
        }
    }
    static class Graph{
        int nv;

        boolean[] marked;
        int[] distTo;
        int[] boomSize;
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
            count = new int[(nv*2)+1];
            distTo[n] = 1;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(n);
            int max=0,day=1;
            System.out.println(adj[n]);
            while (!q.isEmpty())
            {
                int v = q.remove();
                for (int w : adj[v])
                {
                    if(!marked[w])
                    {
                        marked[w] = true;
                        distTo[w] = distTo[v]+1;
                        count[distTo[w]]++;
                        if(count[distTo[w]]-1 > max)
                        {
                            max = count[distTo[w]];
                            day = distTo[w] -1 ;
                        }
                        q.add(w);
                    }
                }
            }
            System.out.println(max);
            System.out.println(day);
            System.out.println();
        }
    }
}
