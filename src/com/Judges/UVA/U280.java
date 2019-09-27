package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N != 0)
        {
            Graph gr = new Graph(N);
            for(;;)
            {
                int key = sc.nextInt()-1;
                if(key == -1)
                    break;
                int current = 0 ;
                while (true)
                {
                    current = sc.nextInt();
                    if(current == 0)
                        break;
                    gr.addEdge(key,current-1);
                }
            }
            int c = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            ArrayList<Integer> not_visited = new ArrayList<>();
            for(int i = 0 ; i < c ; i++)
            {

                gr.dfs(sc.nextInt()-1);
                for(int j = 0 ; j < N ; j++)
                {
                    if(!gr.visited[j])
                    {
                        not_visited.add(j+1);
                    }
                    gr.visited[j] = false;
                }
                sb.append(not_visited.size());
                for(int l : not_visited)
                    sb.append(" "+l);
                sb.append("\n");
                not_visited.clear();

            }
            System.out.print(sb.toString());
            N = sc.nextInt();
        }
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
        }
        public void dfs(int v)
        {

            for (int w :
                    adj[v]) {
                if(!visited[w])
                {
                    visited[w] = true;
                    dfs(w);
                }
            }
        }
    }
}
