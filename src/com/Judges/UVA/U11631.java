package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U11631 {

    static class FastReader {
            BufferedReader br;
            StringTokenizer st;
            FastReader() { // To read from the standard input
                br = new BufferedReader(new InputStreamReader(System.in));
            }
            // You can add a constructor to read from a file
            /////
            Long nextLong() throws Exception
            {
                return Long.parseLong(next());
            }
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

    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        while (true)
        {
            int M = sc.nextInt();
            int N = sc.nextInt();
            if(M == 0 && N == 0)
                break;
            UF u = new UF(M);
            Edge[] edges = new Edge[N];
            long max = 0;
            for(int i = 0 ; i < N ; i++)
            {
                edges[i] = new Edge(sc.nextInt(),sc.nextInt(),sc.nextLong());
                max += edges[i].weight;
            }
            Arrays.sort(edges);
            long sum = 0 ;
            for(int i = 0 ; i < N ; i++)
            {
                if(!u.connected(edges[i].v1,edges[i].v2))
                {
                    u.union(edges[i].v1,edges[i].v2);
                    sum += edges[i].weight;
                }
            }
            System.out.println(max-sum);
        }
    }
    static class Edge implements Comparable<Edge>
    {
        @Override
        public String toString() {
            return v1+" "+v2+" "+weight;
        }

        int v1,v2;
        long weight;
        @Override
        public int compareTo(Edge o) {
            return Long.compare(weight,o.weight);
        }
        public Edge(int v1,int v2, long w)
        {
            this.v1 = v1;
            this.v2 = v2;
            weight = w;
        }
    }
    static class Graph{
        int nv;
        ArrayList<Integer>[] adj;

        public Graph(int N)
        {
            nv = N;
            adj =(ArrayList<Integer>[]) new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
                adj[i] = new ArrayList<>();

        }
        public void addEdge(int n1,int n2)
        {
            adj[n1].add(n2);
            adj[n2].add(n1);
        }

    }

    static class UF{
        int[] id;
        public UF(int N)
        {
            id = new int[N];
            for(int i = 0 ; i < N ; i++)
                id[i] = i;

        }
        public boolean connected(int p , int q)
        {
            return find(p) == find(q);
        }
        private void union(int p,int q)
        {
            int rq = find(q);
            int rp = find(p);
            if(rq != rp)
                id[rq] = rp;
        }
        public int find(int p)
        {
            while(p != id[p])
                p = id[id[p]];
            return p;
        }
    }
}
