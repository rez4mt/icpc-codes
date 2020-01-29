package com.ICPC.KCPC.K2019;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Tree {
    static int[] values;
    static ArrayList<Integer>[] adj;
    static int N ;
    static boolean[][] palind ;
    static boolean[][] checked ;
    static ArrayList<Integer> path ;
    static boolean[] onPath ;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        values = new int[1002];
        adj = new ArrayList[1002];
        onPath = new boolean[1002];
        path = new ArrayList<>();
        for(int i = 0 ; i < 1002; i++)
            adj[i] = new ArrayList<>(1002);
        palind = new boolean[1002][1002];
        checked = new boolean[1002][1002];
        while (T-->0)
        {
            N = sc.nextInt();
            for(int i = 0 ; i <= N ; i++)
            {
                adj[i].clear();
                for(int j = 0 ; j <=  N ; j++)
                {
                    checked[i][j] = false;
                    palind[i][j] = false;
                }
            }

            //read path values
            for(int i = 1 ; i <=N ; i++)
                values[i] = sc.nextInt();
            //read connections
            for(int i = 1 ; i <N ; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            for(int i = 1 ; i <= N ; i++)
            {
                for(int j = 1 ; j <= N ; j++)
                {
                    dfs(i , i ,j);
                }
            }
            //
            int Q = sc.nextInt();
            while (Q-->0)
            {
                System.out.println(palind[sc.nextInt()][sc.nextInt()]?"Yes":"No");
            }
        }
    }
    private static void dfs(int start,int current , int end)
    {
        if(checked[start][end])
            return ;
        path.add(values[current]);
        if(!checked[start][current])
        {

            boolean flag = true;
            for(int i = 0 ; i <= path.size()/2 ; i++)
            {
                if(!path.get(i).equals(path.get(path.size()-1-i)) )
                {
                    flag = false;
                    break;
                }
            }
            checked[start][current]  = true;
            checked[current][start]  = true;
            palind[start][current] = flag;
            palind[current][start] = flag;
        }

        if(current == end)
        {
            path.remove(path.size()-1);
            return ;
        }
        onPath[current] = true;
        for (int e : adj[current]) {
            if (!onPath[e]) {
                dfs(start, e , end);
            }
        }
        onPath[current] = false;
        path.remove(path.size()-1);
    }
}
