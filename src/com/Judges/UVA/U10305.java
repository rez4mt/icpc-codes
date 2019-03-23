package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class U10305 {
    public static void main(String[] args) throws IOException {
        FastReader fr =new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        while (true)
        {
            int N = fr.nextInt();
            int M = fr.nextInt();
            if(N==M && N == 0)
                break;
            Graph g =new Graph(N);
            for(int i = 0 ; i < M ; i++)
            {
                ///add to graph
                g.addEdge(fr.nextInt()-1,fr.nextInt()-1);
            }
            for(int i = 0 ; i < N ; i++)
                if(!g.marked[i])
                    g.dfs(i);
                //
            StringBuilder b = new StringBuilder();
            while (!g.stack.isEmpty())
                b.append((g.stack.pop()+1)+" ");
            b.deleteCharAt(b.length()-1);
            pw.println(b);
        }
        pw.flush();

    }
    static class Graph{
        Stack<Integer> stack;

        int nv;
        boolean[] marked ;
        ArrayList<Integer>[] adj ;

        public Graph(int n)
        {
            nv = n;
            adj =(ArrayList<Integer>[]) new ArrayList[n];
            for(int i = 0 ; i < n ; i++)
                adj[i] = new ArrayList<>();
            marked = new boolean[n];
            stack = new Stack<>();
        }
        public void addEdge(int v1,int v2)
        {

            adj[v1].add(v2);
        }
        private void dfs(int n)
        {
            marked[n] = true;
            for (int w :
                    adj[n]) {
                if (!marked[w])
                {
                    dfs(w);
                }
            }
            stack.push(n);
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { // To read from the standard input
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        // You can add a constructor to read from a file
        /////
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        String nextLine() throws IOException { return br.readLine(); }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        //You can add nextDouble() etc...
        boolean hasNext() throws IOException { // if input is terminated by EOF
            String s = br.readLine();
            if (s == null) return false;
            st = new StringTokenizer(s);
            return true;
        }
    } //end FastReader
}
