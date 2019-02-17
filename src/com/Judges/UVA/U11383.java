package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class U11383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N =sc.nextInt(),M = sc.nextInt();
            if(N == 0 && M == 0)
                break;
            DiGraph g = new DiGraph(N);
            for(int i = 0 ; i < M ; i++)
                g.addEdge(sc.nextInt()-1,sc.nextInt()-1,sc.nextInt());

            DiGraph reverse = g.reverse();
            for(int i = 0 ; i < N ; i++)
            {
                if(!reverse.marked[i])
                    reverse.dfs(i);
            }
            Stack<Integer> postOrder = reverse.post;
            while (!postOrder.isEmpty())
            {
                int temp = postOrder.pop();
                if(!g.marked[temp])
                {
                    g.dfs(temp);
                    g.count++;
                }
            }
            System.out.println(g.count==1?1:0);
        }
    }

    static class DiGraph{
        int[] id;
        int count;
        boolean[] marked ;
        int nv;
        ArrayList<Integer>[] adj;
        Stack<Integer> post;
        public DiGraph(int n)
        {
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[n];
            for(int i = 0 ; i < n ; i++)
                adj[i] = new ArrayList<>();
            marked = new boolean[n];
            post = new Stack<>();
            count = 0;
            id = new int[n];
        }

        public void addEdge(int v1,int v2,int type)
        {
            adj[v1].add(v2);
            if(type == 2)
                adj[v2].add(v1);
        }

        public DiGraph reverse()
        {
            DiGraph reverse = new DiGraph(nv);

            for(int i = 0 ; i < nv;i++)
            {
                for (int w :
                        adj[i]) {
                    reverse.addEdge(w, i, 0);
                }
            }

            return reverse;
        }

        public void dfs(int v)
        {
            marked[v] = true;
            id[v] = count;
            for (int w : adj[v]) {
                if (!marked[w]) dfs(w);
            }
            post.push(v);
        }

        @Override
        public String toString() {
            StringBuilder b = new StringBuilder();
            for(int i = 0 ; i < nv ; i++)
                for (int w : adj[i]) b.append(String.format("%d %d\n",i+1,w+1));
                //
            return b.toString();
        }
    }
}
