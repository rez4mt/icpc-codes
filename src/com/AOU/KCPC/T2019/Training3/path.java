package com.AOU.KCPC.T2019.Training3;

import java.util.*;

public class path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N =sc.nextInt();
            int M =sc.nextInt();
            Graph g = new Graph(N);
            for(int i = 0 ; i < M ; i++)
                g.addEdge(sc.nextInt()-1,sc.nextInt()-1,Double.valueOf(sc.next()));
            g.bfs(0);
            if(g.distTo[N-1] == Double.NEGATIVE_INFINITY)
                System.out.println("0.00");
            else System.out.printf("%.2f\n",g.distTo[N-1]);

        }
    }
    static class Graph{
        boolean[] visisted;
        double[] distTo ;
        ArrayList<Edges>[] adj ;
        PriorityQueue<mEdges> pq ;
        public Graph(int N)
        {
            distTo = new double[N];
            visisted = new boolean[N];
            adj = new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
                adj[i] = new ArrayList<>();
            pq = new PriorityQueue<>();

        }
        public void addEdge(int v , int w , double weight)
        {
            /*if(weight == 0)
                return ;*/
            Edges e = new Edges(v , w , weight);

            adj[v].add(e);
            adj[w].add(e);
        }
        private void bfs(int s)
        {
            pq.add(new mEdges(s,1));
            Arrays.fill(distTo , Double.NEGATIVE_INFINITY);
            distTo[s] = 1d;

            while (!pq.isEmpty())
            {
                mEdges v = pq.remove();
                for (Edges e :
                        adj[v.v]) {
                    int w = e.getOther(v.v);
                    if(distTo[w] < distTo[v.v]*e.weight)
                    {
                        distTo[w] = distTo[v.v]*e.weight;
                        pq.add(new mEdges(w,distTo[w]));
                    }
                }
            }
        }
    }
    static class mEdges implements Comparable<mEdges>{
        int v ;

        @Override
        public int compareTo(mEdges o) {
            return -Double.compare(weight , o.weight);
        }

        double weight;
        public mEdges(int v , double w)
        {
            this.v = v;
            weight = w;
        }

        @Override
        public String toString() {
            return String.format("[v:%d, w:%.5f]",v,weight);
        }
    }
    static class Edges implements Comparable<Edges>{
        @Override
        public int compareTo(Edges o) {
            return Double.compare(weight , o.weight);
        }

        int v , u ;
        double weight ;
        public Edges(int v , int u , double w)
        {
            this.v = v;
            this.u = u;
            this.weight = w;
        }
        public int getFirst()
        {
            return v;
        }
        public int getOther(int a)
        {
            if(a == v)
                return u;
            else return v ;
        }

        @Override
        public String toString() {
            return String.format("[v:%d ,u:%d , w:%.5f]",u,v,weight );
        }
    }



}
