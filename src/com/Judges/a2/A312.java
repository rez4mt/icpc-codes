package com.Judges.a2;

import com.Judges.UVA.U10034;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int e = sc.nextInt();
            PriorityQueue<Edge> q = new PriorityQueue<>();
            for(int i = 0 ; i < e ; i++)
                q.offer(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));

            UF u = new UF(N+1);
            long finalWeight = 0;
            int start_point = sc.nextInt();
            int end_point = sc.nextInt();
            while (!q.isEmpty())
            {
                Edge temp = q.poll();
                if(!u.connected(temp.v,temp.w))
                {
                    u.union(temp.v,temp.w);
                    finalWeight+=temp.weight;
                }
                if(u.connected(start_point , end_point))
                    break;
            }
            if(u.connected(start_point,end_point))
                System.out.println(finalWeight);
            else System.out.println("-1");
        }
    }


    static class UF{
        int[] ids;
        public UF(int n)
        {
            ids = new int[n];
            for(int i = 0 ; i < n ; i++)
                ids[i] = i;
        }

        public int find(int id)
        {
            while (id != ids[id])
            {
                id = ids[ids[id]];
            }
            return id;
        }
        public void union(int p,int q)
        {
            int rootq = find(q);
            int rootp = find(p);
            if(rootp == rootq)
                return;
            ids[rootq] = rootp;
        }
        public boolean connected(int p,int q)
        {
            return find(p) == find(q);
        }
    }


    static class Edge implements Comparable<Edge>{
        int v,w;
        int weight;
        @Override
        public int compareTo(Edge o) {
            if(o.weight == weight)
                return 0;
            return weight < o.weight ? -1 : 1;
        }
        public Edge(int v , int w, int weight)
        {
            this.v = v;
            this.w = w;
            this.weight = weight;
        }
    }

    static class FR{
        BufferedReader br;
        StringTokenizer st;
        public FR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() throws Exception
        {
            if(st == null || !st.hasMoreTokens())
            {
                st = new StringTokenizer(br.readLine());
                return next();
            }
            return st.nextToken();
        }
        public int nextInt() throws Exception
        {
            return Integer.valueOf(next());
        }
        public double nextDouble() throws Exception
        {
            return Double.parseDouble(next());
        }
    }

    static class Graph{
        boolean[] visited;
        int[] distTo ;
        int[] weight ;
        ArrayList<Integer>[] adj ;
        public Graph(int N)
        {
            adj = (ArrayList<Integer>[]) new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
                adj[i] = new ArrayList<>();
            visited = new boolean[N];
            distTo = new int[N];
            weight = new int[N];
            Arrays.fill(distTo,Integer.MAX_VALUE);
        }
        public void addEdge(int u , int v, int w)
        {

        }
        static class Node{

        }
        public void bfs(int source)
        {
            visited[source] = true;
            distTo[source] = 0;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(source);
            while (!q.isEmpty())
            {
                int child = q.remove();
                for (int w:adj[child]){
                    if(!visited[w])
                    {
                        distTo[w] = distTo[child]+1;
                        visited[w] = true;
                        q.add(w);
                    }
                }
            }
        }
    }
}
