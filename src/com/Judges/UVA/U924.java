package com.Judges.UVA;

import java.util.*;

public class U924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NE = sc.nextInt();
        Graph g = new Graph(NE);
        for(int i = 0 ; i < NE;i++)
        {
            //num of emps
            int N = sc.nextInt();
            for(int j = 0 ; j < N;j++)
            {
                //
                g.addEdge(i,sc.nextInt());
            }

        }
        int N = sc.nextInt();
        for(int j = 0 ; j < N ; j++)
        {

            g.bfs(sc.nextInt());
        }
    }
    static class Graph{
        int nv;

        boolean[] marked;
        int[] distTo;
        ArrayList<Integer>[] adj;
        public Graph(int n)
        {
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[nv];
            for(int i = 0 ; i < n ; i++)
                adj[i] = new ArrayList<Integer>();
        }
        public void addEdge(int v1,int v2)
        {
            adj[v1].add(v2);
        }
        public void bfs(int n)
        {
            distTo = new int[nv];
            for(int i = 0 ; i < nv ;i++)
                distTo[i] = Integer.MAX_VALUE;
            marked = new boolean[nv];
            distTo[n] = 0;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(n);
            int max_dist = 0 , boom_day = 1 , max_boom=0;
            HashMap<Integer , Integer> map = new HashMap<>();
            marked[n] = true;
            while (!q.isEmpty())
            {
                int v = q.remove();
                for (int w : adj[v])
                {
                    if(!marked[w])
                    {
                        q.add(w);
                        marked[w] = true;
                        distTo[w] = distTo[v]+1;
                        if(!map.containsKey(distTo[w]))
                            map.put(distTo[w] , 0);
                        map.put(distTo[w] , map.get(distTo[w])+1);
                        max_dist = Integer.max(distTo[w] , max_dist);
                    }
                }
            }
            if(!map.containsKey(1))
            {
                System.out.println(0);
                return;
            }
            max_boom = map.get(1);
            for(int i = 2 ; i<= max_dist ;i++)
            {
                if(!map.containsKey(i))
                    continue;
                int c = map.get(i);
                if(c>max_boom)
                {
                    max_boom = c;
                    boom_day = i;
                }

            }
            System.out.printf("%d %d\n",max_boom , boom_day);

        }
    }
}
