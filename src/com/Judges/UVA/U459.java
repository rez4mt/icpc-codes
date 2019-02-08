package com.Judges.UVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class U459 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        boolean first = true;
        while (T-->0)
        {
            if(!first)
                System.out.println();

            String largest = sc.nextLine();
            Graph g = new Graph((largest.charAt(0) - 'A') + 1);
            String data;
            while (sc.hasNext() && !(data = sc.nextLine()).equals(""))
                g.addEdge(data.charAt(0),data.charAt(1));
            for(int i = 0 ; i < g.nv ; i++)
            {
                if(!g.marked[i])
                {
                    g.dfs(i);
                    g.count ++;
                }
            }
            first = false;
            System.out.println(g.count);
        }
    }

    static class Graph{
        int nv,ne;
        ArrayList<Integer>[] adj;
        HashMap<Character,Integer> vs;
        boolean[] marked ;
        int count = 0 ;

        public Graph(int n)
        {

            ne = 0;
            nv = n;
            adj = (ArrayList<Integer>[]) new ArrayList[nv];
            for(int i = 0 ; i < n ; i++)
                adj[i] = new ArrayList<Integer>();

            marked = new boolean[nv];
            vs = new HashMap<>();

        }
        public void addEdge(char v1,char v2)
        {
            vs.putIfAbsent(v1,vs.size());
            vs.putIfAbsent(v2,vs.size());
            addEdge(vs.get(v1),vs.get(v2));
        }
        public void addEdge(int v1,int v2)
        {
            ne++;
            adj[v1].add(v2);
            adj[v2].add(v1);
        }
        public void dfs(int v)
        {
            marked[v] = true;
            for(int w : adj[v])
            {
                if(!marked[w])
                    dfs(w);
            }
        }
    }
}
