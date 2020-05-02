package com.Judges.CodeForce.CF1325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C {
    static ArrayList<Integer>[] edges;
    static edges[] edgelist;
    static int[][] mex ;
    static int current = 1;
    static boolean[] visited ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //first one is always zero
        mex = new int[N][N];
        visited = new boolean[N];
        edges = new ArrayList[N];
        for(int i = 0 ; i < N ; i++)
            edges[i] = new ArrayList<>();
        edgelist = new edges[N];
        for(int i = 0 ; i< N -1 ; i++)
        {
            int u = sc.nextInt()-1;
            int v =sc.nextInt()-1;
            edgelist[i] = new edges(u , v);

            edges[u].add(v);
            edges[v].add(u);
        }
        mex[edgelist[0].u][edgelist[0].v] = mex[edgelist[0].v][edgelist[0].u]=-1 ;
        dfs(0,-1);
        mex[edgelist[0].u][edgelist[0].v] = mex[edgelist[0].v][edgelist[0].u]=0;
        for (edges e: edgelist) {
            if(e==null)
                break;
            System.out.println(mex[e.u][e.v]);
        }
    }
    private static void dfs(int n,int from)
    {
        visited[n] = true;
        for (int v : edges[n]) {
            if(!visited[v] && v!=from)
                dfs(v,n);
        }
        if(from!=-1 && mex[n][from] == 0)
            mex[n][from] = mex[from][n] = current++;
    }
    static class edges{
        int u , v;
        public edges(int u , int b)
        {
            this.u = u;
            this.v =b;
        }
    }
}
