package com.Judges.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class TOPOSORT {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int N = fr.nextInt();
        int M = fr.nextInt();
        DiGraph g = new DiGraph(N);
        for(int i = 0 ; i < M ; i++)
            g.addEdge(fr.nextInt()-1,fr.nextInt()-1);

        for(int i = 0 ; i < g.nv; i++)
        {
            if(!g.marked[i])
                g.dfs(i);
        }
        StringBuilder b = new StringBuilder();
        while (!g.revPost.isEmpty())
            b.append((g.revPost.pop()+1)+" ");
        System.out.println(b.deleteCharAt(b.length()-1));
    }


    static class FastReader{
        StringTokenizer st;
        BufferedReader br;
        public FastReader() throws IOException
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() throws IOException
        {
            if(st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());

            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
    }
    static class DiGraph{
        int nv;
        boolean[] marked ;
        ArrayList<Integer>[] adj;
        Stack<Integer> revPost;

        public DiGraph(int n)
        {
            nv = n ;
            adj =(ArrayList<Integer>[]) new ArrayList[nv];
            for(int i = 0 ; i < nv; i++)
                adj[i] = new ArrayList<>();

            marked = new boolean[nv];
            revPost = new Stack<>();
        }
        public void addEdge(int v1,int v2)
        {
            adj[v1].add(v2);
        }

        void dfs(int v)
        {
            marked[v] = true;
            for (int w:adj[v]){
                if(!marked[w])
                {
                    dfs(w);
                }
            }
            revPost.push(v);
        }
        public DiGraph getReverse()
        {
            DiGraph rev = new DiGraph(nv);
            for(int i = 0 ; i < nv ; i++)
            {
                for(int w: adj[i])
                {
                    rev.addEdge(w,i);
                }
            }
            return rev;
        }
        public Stack<Integer> getRevPost()
        {
            return revPost;
        }
    }
}
