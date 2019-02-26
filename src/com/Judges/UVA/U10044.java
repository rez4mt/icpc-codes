package com.Judges.UVA;

import java.util.*;

public class U10044 {
    public static void main(String[] args) {
        String erdos = "Erdos, P.";
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int c = 1;
        while (T-->0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();
            Graph g = new Graph((N*2) +1);
            HashMap<String,Integer> map = new HashMap<>();
            for(int i = 0 ; i < N ; i++)
            {
                String[] names = sc.nextLine().split(":")[0].split(",");
                String[] us = new String[names.length/2];
                for(int j = 0 ; j < names.length;j+=2)
                {
                    String name = names[j].trim()+", "+names[j+1].trim();
                    if(!map.containsKey(name))
                        map.put(name,map.size());
                    us[j/2] = name;
                }
                for(int j = 0 ; j < us.length;j++)
                    g.addEdge(map.get(us[j]),map.get(us[(j+1) % us.length]));
            }
            g.bfs(map.get(erdos));
            System.out.println("Scenario "+(c++));
            for(int i = 0 ; i < M ; i++)
            {
                String n = sc.nextLine();
                int dist;
                if(!map.containsKey(n))
                {
                    dist = Integer.MAX_VALUE;
                }else
                    dist = g.distTo[map.get(n.trim())];
                System.out.printf("%s %s\n",n,dist == Integer.MAX_VALUE ? "infinity" : dist);
            }
        }
    }

    static class Graph{
        int nv;
        ArrayList<Integer>[] adj;
        int[] distTo ;
        boolean[] marked ;
        public Graph(int N)
        {
            nv = N;
            adj = (ArrayList<Integer>[]) new ArrayList[N];
            for (int i = 0; i < N; i++)
                adj[i] = new ArrayList<>();
            marked = new boolean[N];
            distTo = new int[N];
        }
        public ArrayList<Integer> adj(int n)
        {
            return adj[n];
        }
        public void addEdge(int v1,int v2)
        {
            adj(v1).add(v2);
            adj(v2).add(v1);
        }

        public void bfs(int n)
        {
            ArrayDeque<Integer> q = new ArrayDeque<>();
            for(int i = 0 ; i < nv ; i ++)
                distTo[i] = Integer.MAX_VALUE;
            distTo[n] = 0;
            marked[n] = true;
            q.add(n);
            while (!q.isEmpty())
            {
                int temp = q.remove();
                for (int w : adj(temp)) {
                    if (!marked[w])
                    {
                        distTo[w] = distTo[temp]+1;
                        marked[w] = true;
                        q.add(w);
                    }
                }
            }
        }
    }
}
