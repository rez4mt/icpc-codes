package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class U12442 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int C =  1;
        PrintWriter pw  = new PrintWriter(System.out);
        while (T-->0)
        {
            int N = Integer.parseInt(br.readLine());
            Graph g = new Graph(N);
            for(int i = 0 ; i < N ; i++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                g.addEdge(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            }
            int max = 0 ;
            int x = -1;
            for(int i = 1 ; i <= N ; i++)
            {
                if(g.distTo[i] == Integer.MAX_VALUE)
                {
                    g.dfs(i);
                }
                if( g.distTo[i] > max)
                {
                    max = g.distTo[i];
                    x = i;
                }
            }
            pw.printf("Case %d: %d\n",C++,x);
        }
        pw.flush();
    }
    static class Graph{
        boolean[] visited ;
        int[] distTo ;
        ArrayList<Integer>[] adj ;
        public Graph(int N)
        {
            visited = new boolean[N+1];
            adj = (ArrayList<Integer>[]) new ArrayList[N+1];
            for(int i = 1 ; i < N+1 ; i++)
                adj[i] = new ArrayList<>();
            distTo = new int[N+1];
            Arrays.fill(distTo , Integer.MAX_VALUE);
        }
        public void addEdge(int v , int u)
        {
            adj[v].add(u);
        }
        public int dfs(int point)
        {
            int sum = 0 ;
            visited[point] = true;
            for (int w :
                    adj[point]) {
                if(!visited[w])
                {
                    sum+=1+dfs(w);
                    visited[w] = false;
                }
            }
            distTo[point] = sum;
            visited[point] = false;
            return sum;

        }
    }
}
