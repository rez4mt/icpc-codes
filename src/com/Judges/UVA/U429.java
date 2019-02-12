package com.Judges.UVA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class U429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        sc.nextLine();
        HashMap<String,Integer> ids;
        while (T-->0)
        {
            ids = new HashMap<>();
            String data;
            while (sc.hasNext() && !(data = sc.nextLine()).isEmpty()){
                if(data.equals("*"))
                    break;
                ids.putIfAbsent(data,ids.size());
            }
            Graph g = new Graph(ids.size());

            for (String k :
                    ids.keySet()) {
                for (String k2 :
                        ids.keySet()) {
                    if(canTransform(k,k2))
                    {
                        g.addEdge(ids.get(k),ids.get(k2));
                    }
                }
            }
            while (sc.hasNext() && !(data = sc.nextLine()).isEmpty())
            {
                //spice stock
                String[] parts = data.split(" ");
                g.bfs(ids.get(parts[0]));
                System.out.printf("%s %s %d\n",parts[0],parts[1],g.distTo[ids.get(parts[1])]);
            }
            //read again
            //add all to graph

            if(T!=0)
                System.out.println();
        }
    }

    static boolean canTransform(String s1,String s2)
    {

        if(s1.length() != s2.length())
            return false;
        if(s1.equals(s2))
            return false;
        int counts = 0;
        for(int i = 0 ; i < s1.length(); i ++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
                counts++;

            if(counts > 1)
                return false;
        }
        return counts == 1;
    }

    static class Graph{

        int nv;
        ArrayList<Integer>[] adj;
        int[] distTo;
        boolean[] marked ;
        public Graph(int n)
        {
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[nv];
            for(int i = 0 ; i < nv; i ++)
                adj[i] = new ArrayList<>();
            marked = new boolean[nv];
            distTo = new int[nv];

        }
        void addEdge(int v1,int v2)
        {
            adj[v1].add(v2);
        }
        void bfs(int s)
        {
            ArrayDeque<Integer> q = new ArrayDeque<>();
            for(int i = 0 ; i < nv; i ++)
            {
                marked[i] = false;
                distTo[i] = Integer.MAX_VALUE;
            }

            distTo[s] = 0;
            marked[s] = true;
            q.add(s);
            while (!q.isEmpty())
            {
                int v = q.remove();
                for(int w : adj[v])
                {
                    if(!marked[w])
                    {
                        distTo[w] = distTo[v]+1;
                        marked[w] = true;
                        q.add(w);
                    }
                }
            }
        }
    }
}
