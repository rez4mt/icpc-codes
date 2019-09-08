//package com.AOU.KCPC.T2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class edison {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("edison.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            graph g = new graph(N+1);
            for(int i = 1 ; i < N+1 ; i++)
                g.val[i] = sc.nextInt();
            for(int i = 0 ; i < N-1 ;i++)
                g.addEdge(sc.nextInt(),sc.nextInt());
            StringBuilder b = new StringBuilder();
            for(int i = 1 ; i <= N ; i++)
            {
                for(int j = 0 ; j <= N ; j++)
                    g.visited[j] = false;
                b.append(g.dfs(i)+" ");
            }
            b.deleteCharAt(b.length()-1);
            System.out.println(b.toString());
        }
    }
    static class graph{
        int N ;
        int[] val ;
        private ArrayList<Integer>[] adj;
        private boolean[] visited ;
        public graph(int N)
        {
            val = new int[N];
            adj = new ArrayList[N];
            visited = new boolean[N];
            for(int i = 0 ; i < N ; i++)
                adj[i] = new ArrayList<>();
            this.N = N;
        }

        public void addEdge(int v, int w) {
            adj[v].add(w);
        }

        public int  dfs(int v)
        {
            int c = val[v] ;
            visited[v] = true;
            for (int w :
                    adj[v]) {
                if(!visited[w])
                {
                    c += dfs(w);
                    //visited[w] = false;
                }
            }
            return c;
        }

    }
}
