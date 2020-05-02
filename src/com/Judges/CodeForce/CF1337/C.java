package com.Judges.CodeForce.CF1337;
import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        //bfs it
        //reverse dfs.
        //the head is in index 0
        Graph g = new Graph(n+1);
        for(int i = 0 ; i < n-1 ; i++)
            g.addEdge(sc.nextInt(), sc.nextInt());
        g.bfs(1);
        //poll from last and bfs on edges..
        System.out.println(g.ans(k));

    }

    static class Graph{
        int edge_count = 0 ;
        boolean[] visited;
        int[] edgeTo ;
        HashSet<Integer>[] list;
        boolean[] inds ;
        int[] distTo;
        int[] level;

        public Graph(int N)
        {
            list = (HashSet<Integer>[]) new HashSet[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = new HashSet<>();
            visited = new boolean[N];
            distTo = new int[N];
            level = new int[N];
            inds = new boolean[N];
            edgeTo = new int[N];

        }


        public void addEdge(int from , int to)
        {
            list[from].add(to);
            list[to].add(from);
        }
        public void bfs(int s)
        {
            for(int i = 0 ; i < visited.length ; i++)
            {
                visited[i] = false;
                distTo[i] = 0 ;
                edgeTo[i] = 0 ;
            }
            visited[s]= true;
            distTo[s]= 0;
            ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
            arrayDeque.add(s);
            pairs.clear();
            pairs.add(new Pair(1,0, false));
            while (!arrayDeque.isEmpty())
            {
                int q = arrayDeque.remove();
                pairs.add(new Pair(q, distTo[q],q!=1 && list[q].size()==1));
                if(list[q].size()==1)
                    edge_count++;
                for (int w : list[q]) {
                    if(visited[w])
                        continue;
                    edgeTo[w] = q;
                    visited[w] = true;
                    distTo[w] = distTo[q]+(inds[q]?0:1);
                    arrayDeque.add(w);
                }
            }
        }
        //i have edges here..
        TreeSet<Pair> pairs = new TreeSet<>();
        public long ans(int k)
        {
            //take edge nodes .. bfs on them
            ArrayDeque<Integer> deq = new ArrayDeque<>();
            PriorityQueue<EL> pq = new PriorityQueue<>();
            Arrays.fill(visited, false);
            while (!pairs.isEmpty())
            {
                Pair p = pairs.pollLast();
                if(!p.last)
                    break;
                deq.add(p.s);
                pq.add(new EL(p.s,0,p.dist));
                visited[p.s] = true;
                level[p.s] = 0 ;
            }
            while (!deq.isEmpty()){
                int p = deq.remove();
                for (int w : list[p]) {
                    if (!visited[w])
                    {
                        visited[w] = true;
                        level[w] = level[p]+1;
                        pq.add(new EL(w, level[w],distTo[w]));
                        deq.add(w);
                    }
                }
            }
            HashSet<Integer> indsE = new HashSet<>();
            while (k-->0)
            {
                EL p =pq.poll();
                inds[p.s]= true;
                indsE.add(p.s);
            }
            bfs(1);
            long ans = 0 ;
            for (int aa :
                    indsE) {
                ans += distTo[aa];
            }
            return ans ;
        }
    }
    static class EL implements  Comparable<EL>
    {
        public EL(int s , int level , int dist)
        {
            this.level = level;
            this.s = s;
            this.dist = dist;
        }
        int level = 0 ;
        int dist = 0 ;
        int s = 0 ;
        @Override
        public int compareTo(EL o) {
            int cmp = Integer.compare(level , o.level);
            if(cmp == 0)
                cmp = -Integer.compare(dist , o.dist);
            if(cmp == 0)
                cmp = Integer.compare(s , o.s);
            return cmp;
        }
    }
    static class Pair implements Comparable<Pair>
    {

        @Override
        public String toString() {
            return "Pair{" +
                    "s=" + s +
                    '}';
        }
        int dist=  0 ;
        int s = 0 ;
        boolean last = false;
        @Override
        public int compareTo(Pair o) {
            int cmp = Boolean.compare(last , o.last);
            if(cmp == 0)
                cmp =  Integer.compare(dist , o.dist);
            if(cmp == 0)
                cmp = Integer.compare(s, o.s);
            return cmp;
        }
        public Pair(int s , int dist, boolean last)
        {
            this.s = s;
            this.dist = dist;
            this.last = last;
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

    }
}
