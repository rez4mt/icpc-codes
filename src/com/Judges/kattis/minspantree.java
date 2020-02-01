package com.Judges.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class minspantree {

    static Edge[] edgeList;
    static int V;
    static ArrayList<Edge> MST;

    public static void main(String[] args) throws Exception{

        FR in = new FR();
        PrintWriter pw = new PrintWriter(System.out);
        while (true) {
            V = in.nextInt();
            int e = in.nextInt();
            if (V == 0 && e == 0) {
                break;
            }
            edgeList = new Edge[e];
            MST = new ArrayList<Edge>();
            for (int i = 0; i < e; i++) {

                int x = in.nextInt();
                int y = in.nextInt();
                int z = in.nextInt();

                Edge a = new Edge(x, y, z);
                edgeList[i] = a;

            }

            int krus = kruskal();
            if (MST.size() != V - 1) {
                pw.println("Impossible");
            } else {
                pw.println(krus);
                Collections.sort(MST, new Comparator<Edge>() {
                    @Override
                    public int compare(Edge o1, Edge o2) {
                        int o1_min = Math.min(o1.u , o1.v);
                        int o2_min = Math.min(o2.v , o2.u);


                        int o1_max = Math.max(o1.u , o1.v);
                        int o2_max = Math.max(o2.u , o2.v);

                        int r = Integer.compare(o1_min, o2_min);
                        if (r == 0) {
                            return Integer.compare(o1_max , o2_max);
                        }
                        return r;
                    }
                });

                for (Edge edge:
                        MST) {
                    pw.println(edge);
                }

            }

        }
        pw.flush();
    }

    static int kruskal()        //O(E log E)
    {
        int mst = 0;
        Arrays.sort(edgeList);
        UnionFind uf = new UnionFind(V);

        for (Edge e : edgeList)
            if (uf.union(e.u, e.v)) {
                mst += e.w;
                MST.add(e);
            }
        return mst;
    }

    static class Edge implements Comparable<Edge> {
        int u, v, w;

        Edge(int a, int b, int c) {
            u = a;
            v = b;
            w = c;
        }

        @Override
        public String toString() {
            return Math.min(v,u)+" "+Math.max(v,u);
        }

        public int compareTo(Edge e) {
            return w - e.w;
        }
    }

    static class UnionFind {
        int[] p, rank;

        UnionFind(int N) {
            p = new int[N];
            rank = new int[N];
            for (int i = 0; i < N; i++)
                p[i] = i;
        }

        int findSet(int x) {
            return p[x] == x ? x : (p[x] = findSet(p[x]));
        }

        boolean union(int x, int y) {
            x = findSet(x);
            y = findSet(y);
            if (x == y)
                return false;

            if (rank[x] > rank[y])
                p[y] = x;
            else {
                p[x] = y;
                if (rank[x] == rank[y])
                    ++rank[y];
            }
            return true;
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