package com.Judges.SPOJ;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TDBFS {

    public static void main(String[] args)throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        FastReader fr = new FastReader();
        int T = fr.nextInt();

        for(int tc = 1 ; tc  <= T ; tc++)
        {

            pw.printf("graph %d\n",tc);
            Graph g = new Graph(fr.nextInt()+1);
            String[][] dp = new String[g.N+1][2];
            for(int i = 1 ; i < g.N ; i++)
            {
                int v = fr.nextInt();
                int count = fr.nextInt();
                while (count-->0)
                    g.add(v , fr.nextInt());

            }
            while (true)
            {
                g.reset();
                int start = fr.nextInt();
                int type=  fr.nextInt();
                if(start == 0 && type == 0)
                    break;
                if(dp[start][type]!=null)
                {
                    pw.println(dp[start][type]);
                    continue;
                }
                StringBuilder b = new StringBuilder();
                if(type == 0)
                {
                    //dfs
                    g.dfs(start);
                    for (int w :
                            g.current_path) {
                        b.append(w+" ");
                    }
                    b.deleteCharAt(b.length()-1);
                    dp[start][type] = b.toString();
                    pw.println(dp[start][type]);
                }else {
                    //bfs
                    g.bfs(start);
                    for (int w :
                            g.current_path) {
                        b.append(w+" ");
                    }
                    b.deleteCharAt(b.length()-1);
                    dp[start][type] = b.toString();
                    pw.println(dp[start][type]);
                }
            }

        }
        pw.flush();
    }


    static class FastReader {
          BufferedReader br;
          StringTokenizer st;
          FastReader() throws Exception{ // To read from the standard input
              br = new BufferedReader(new InputStreamReader(System.in));
          }
          String next() throws IOException {
              while (st == null || !st.hasMoreTokens())
                  st = new StringTokenizer(br.readLine());
              return st.nextToken();
          }
          String nextLine() throws IOException { return br.readLine(); }
          int nextInt() throws IOException { return Integer.parseInt(next()); }
          long nextLong() throws IOException { return Long.parseLong(next()); }
          //You can add nextDouble() etc...
          boolean hasNext() throws IOException { // if input is terminated by EOF
              String s = br.readLine();
              if (s == null) return false;
              st = new StringTokenizer(s);
              return true;
          }
    } //end FastReader

    static class Graph{
        ArrayList<Integer>[] adj;
        boolean[] visited ;
        int N ;
        public Graph(int N)
        {
            this.N = N;
            adj = (ArrayList<Integer>[]) new ArrayList[N];
            for(int i = 0 ; i < N ;i++)
                adj[i] = new ArrayList<>();
            visited = new boolean[N];
        }
        public void add(int v , int w)
        {
            adj[v].add(w);
            adj[w].add(v);
        }
        ArrayList<Integer> current_path ;
        public void reset()
        {
            for(int i = 0 ; i < N ; i++)
                visited[i] = false;
            current_path = new ArrayList<>();
        }
        public void dfs(int source)
        {
            visited[source] = true;
            current_path.add(source);
            for (int w :
                    adj[source]){
                if(!visited[w])
                {
                    dfs(w);
                }
            }
        }
        public void bfs(int source)
        {
            ArrayDeque<Integer> deq = new ArrayDeque<>();
            deq.add(source);
            current_path.add(source);
            visited[source] = true;
            while (!deq.isEmpty())
            {
                int s = deq.remove();
                for (int w :
                        adj[s]) {
                    if(!visited[w])
                    {
                        visited[w] = true;
                        deq.add(w);
                        current_path.add(w);
                    }
                }
            }
        }
    }

}
