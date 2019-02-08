package com.Judges.UVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class U615 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean comp = false;
        int c = 1;
        while (!comp)
        {
            HashMap<Integer,ArrayList<Integer>> map;
            HashMap<Integer,Integer> ids;

            map = new HashMap<>();
            ids = new HashMap<>();

            while (true)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a < 0 && b < 0)
                {
                    comp = true;
                    break;
                }

                if(a == 0 && b == 0)
                {

                    Graph graph = new Graph(ids.size());
                    for (int k : map.keySet())
                        for (int v : map.get(k))
                            graph.addEdge(k,v);
                    //
                    System.out.printf("Case %d is %s tree.\n",c++,graph.isTree()?"a":"not a");
                    ids.clear();
                    map.clear();

                }else
                {
                    ids.putIfAbsent(a,ids.size());
                    ids.putIfAbsent(b,ids.size());

                    map.putIfAbsent(ids.get(a),new ArrayList<>());
                    map.get(ids.get(a)).add(ids.get(b));
                }
            }
        }

    }

    static class Graph
    {
        class UF{
            int[] ids;
            public UF(int n)
            {
                ids = new int[n];
                for(int i = 0 ; i < n ; i ++)
                    ids[i] = i;
            }
            boolean connected(int p , int q)
            {
                return find(p) == find(q);
            }
            int find(int p)
            {
                while (p!=ids[p])
                    p = ids[ids[p]];
                return p;
            }
            void union(int p , int q)
            {
                int rootP = find(p);
                int rootQ = find(q);
                if(rootP == rootQ)
                    return;
                ids[rootQ] = rootP;
            }
        }
        private int[] indegree;
        int nv;
        int count;
        int ne = 0;
        boolean[] marked ;
        int[] edgeTo ;
        ArrayList<Integer>[] adj;
        private boolean hasSelfLoop = false;
        UF u;

        boolean hasCycle = false;
        boolean parallelEdge = false;
        public Graph(int n)
        {
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[nv];
            u = new UF(n);
            count = 0;
            edgeTo = new int[nv];
            marked = new boolean[nv];
            indegree = new int[nv];
            for(int i = 0 ; i < nv ; i++)
                adj[i] = new ArrayList<Integer>();
        }
        public void addEdge(int v1,int v2)
        {
            if(v1 == v2)
                hasSelfLoop = true;
            if(u.connected(v1,v2))
                parallelEdge = true;
            ne++;
            adj[v1].add(v2);
            indegree[v2]++;
            u.union(v1,v2);
        }
        private boolean isTree()
        {
            return  !parallelEdge && !hasSelfLoop && inDegreeValidate() &&  allConnected() ;
        }
        private boolean allConnected()
        {
            for(int i = 0 ; i < nv ; i ++)
            {
                for(int j = 0 ; j < nv ; j++)
                {
                    if(!u.connected(i,j))
                        return false;
                }
            }
            return true;
        }
        private boolean inDegreeValidate()
        {
            for(int i = 0 ; i < nv ; i++)
            {
                if(indegree[i] != 1)
                {
                    if(adj[i].size()==0)
                        return false;
                }
            }
            return true;
        }

    }
}
