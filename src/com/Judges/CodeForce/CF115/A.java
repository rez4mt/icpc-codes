package com.Judges.CodeForce.CF115;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Graph g = new Graph(N+1);
        int groups = 0 ;
        for(int i = 1 ; i <= N ; i++)
        {
            int l =sc.nextInt();
            if(l==-1)
                continue;
            g.addEdge(i,l);
        }

        System.out.println(groups);
    }
    static class Graph{
        int N ;
        boolean[] visited ;
        ArrayList<Integer>[] adj;
        public Graph(int N)
        {
            this.N = N ;
            adj =(ArrayList<Integer>[]) new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
                adj[i] = new ArrayList<>();
            visited = new boolean[N];
        }
        public void addEdge(int v1 , int v2)
        {
            adj[v1].add(v2);
            //adj[v2].add(v1);
        }

    }
}
