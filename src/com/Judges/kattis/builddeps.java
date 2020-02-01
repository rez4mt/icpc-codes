package com.Judges.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class builddeps {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Graph g = new Graph(N);
        HashMap<String , Integer> ids = new HashMap<>();
        HashMap<Integer , String> keys = new HashMap<>();
        PrintWriter pw = new PrintWriter(System.out);
        for(int i = 0 ; i < N ; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken().replace(":","");
            if(!ids.containsKey(s))
            {
                keys.put(ids.size() , s);
                ids.put(s,ids.size());
            }
            while (st.hasMoreTokens())
            {
                String current =  st.nextToken();
                if(!ids.containsKey(current))
                {
                    keys.put(ids.size() , current);
                    ids.put(current , ids.size());
                }
                g.addEdge(ids.get(current) , ids.get(s));
            }
        }
        String from = br.readLine();
        int fid = ids.get(from);
         g.dfs(fid);
        Collections.reverse(g.mlist);
        for (int k :
                g.mlist) {
            pw.println(keys.get(k));
        }
        pw.flush();
    }
    static class Graph{

        boolean[] visited;
        ArrayList<Integer>[] list;
        ArrayList<Integer> mlist = new ArrayList<>();

        public Graph(int N)
        {
            list = (ArrayList<Integer>[]) new ArrayList[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = new ArrayList<>();
            visited = new boolean[N];
        }
        public void addEdge(int from , int to)
        {
            list[from].add(to);
        }
        public void dfs(int s)
        {
            visited[s] = true;
            for (int v : list[s]) {
                if(!visited[v])
                    dfs(v);
            }
            mlist.add(s);
        }
    }
}
