package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class U10034 {
    public static void main(String[] args) throws Exception {
        FR fr = new FR();
        int T = fr.nextInt();
        while (T-->0)
        {
            int n = fr.nextInt();
            Point[] points = new Point[n];
            PriorityQueue<Edge> q = new PriorityQueue<>();
            for(int i = 0; i< n ; i++)
            {
                points[i] = new Point(fr.nextDouble(),fr.nextDouble(),i);
            }
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = i+1;j<n;j++)
                    q.add(new Edge(points[i],points[j]));
            }
            UF uf = new UF(n);
            double finalWeight = 0;
            while (!q.isEmpty())
            {
                Edge temp = q.poll();
                if(!uf.connected(temp.w.id,temp.v.id))
                {
                    uf.union(temp.w.id,temp.v.id);
                    finalWeight+=temp.weight;
                }
            }
            System.out.printf("%.2f\n",finalWeight);
            if(T!=0)
                System.out.println();
        }
    }
    static class Point{
        double x,y;
        int id ;
        public Point(double x,double y)
        {
            this.x = x;
            this.y = y;
        }
        public Point(double x,double y,int id)
        {
            this.x = x;
            this.y = y;
            this.id = id;
        }
        @Override
        public String toString() {
            return String.format("%f %f",x,y);
        }
    }
    static class Edge implements Comparable<Edge>{
        Point v,w;
        double weight;
        @Override
        public int compareTo(Edge o) {
            if(o.weight == weight)
                return 0;
            return weight < o.weight ? -1 : 1;
        }
        public Edge(double x1,double y1,double x2,double y2)
        {
            v = new Point(x1,y1);
            w = new Point(x2,y2);
            weight = weight(v,w);
        }
        public Edge(Point p1,Point p2)
        {
            v = p1;
            w = p2;
            weight = weight(v,w);
        }
        private double weight(Point p1,Point p2)
        {
            return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p2.y-p1.y,2));

        }

        @Override
        public String toString() {
            return String.format("(%f %f)-(%f %f)  %f",v.x,v.y,w.x,w.y,weight);
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
}
