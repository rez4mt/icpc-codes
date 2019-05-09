package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class U796 {
    public static void main(String[] args) throws IOException {
        FR sc = new FR();
        int c = 0;
        while (true)
        {
            String l = sc.nextLine();
            if(l.isEmpty())
                break;

            int N = Integer.parseInt(l);
            if(N == 0)
            {
                System.out.println("0 critical links");
                break;
            }
            if(c++ != 0)
                System.out.println();

            Graph g = new Graph(N);
            String line ;
            while (!(line = sc.nextLine()).isEmpty())
            {
                StringTokenizer st = new StringTokenizer(line);
                int v = Integer.parseInt(st.nextToken());
                String s= st.nextToken();
                int counts = Integer.parseInt(s.substring(1,s.length()-1));
                for(int i = 0 ; i < counts ; i++)
                    g.addEdge(v,Integer.parseInt(st.nextToken()));
            }
            //process data
            for(int i = 0 ; i < N;i++)
                if(!g.marked[i])
                    g.dfs(i,-1);
                //
            System.out.printf("%d critical links\n",g.links.size());
            while (!g.links.isEmpty())
            {
                Edge e = g.links.remove();
                System.out.printf("%d - %d\n",e.getFirst(),e.getLast());
            }



        }
    }
    static class FR{
        BufferedReader br;
        StringTokenizer st;
        public FR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String nextLine() throws IOException
        {
            return br.readLine();
        }
        public String next() throws IOException{
            if( st == null ||!st.hasMoreTokens())
            {
                st = new StringTokenizer(br.readLine());
                return next();
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException
        {
            return Integer.parseInt(next());
        }
    }
    static class Graph
    {
        int nv;
        ArrayList<Integer>[] adj;
        boolean marked[];
        int[] disc,low;
        int count;
        int[] id;
        PriorityQueue<Edge> links;

        public Graph(int n)
        {
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[n];
            for(int i = 0 ; i < n; i++)
                adj[i] = new ArrayList<>();
            id = new int[n];
            count = 0;
            disc = new int[n];
            low = new int[n];
            links = new PriorityQueue<>();
            marked = new boolean[n];
            for(int i = 0 ; i < n ; i++)
            {
                disc[i] = Integer.MAX_VALUE;
                low[i] = Integer.MAX_VALUE;
            }
        }

        public void addEdge(int v1 , int v2)
        {
            adj[v1].add(v2);
        }

        public ArrayList<Integer> adj(int v)
        {
            return adj[v];
        }

        public void dfs(int v,int u)
        {
            marked[v] = true;
            low[v] = disc[v] = ++count;
            for (int w : adj(v)) {
                if(!marked[w])
                {
                    dfs(w,v);
                    if(low[w]>disc[v])
                    {
                        links.offer(new Edge(w,v));
                    }
                }else {
                    low[v] = Math.min(low[v],low[w]);
                }
            }

        }
    }

    static class Edge implements Comparable<Edge>{
        int a,b;
        int min,max;
        @Override
        public int compareTo(Edge o) {
            int A = Integer.compare(min,o.min);
            if(A == 0)
                return - Integer.compare(o.max,max);
            return A;
        }

        public Edge(int a , int b)
        {
            this.a = a;
            this.b = b;
            min = getFirst();
            max = getLast();
        }

        public int getFirst()
        {
            return Math.min(a,b);
        }
        public int getLast()
        {
            return Math.max(a,b);
        }
    }
}
