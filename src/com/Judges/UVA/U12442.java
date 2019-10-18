package com.Judges.UVA;

import java.beans.Visibility;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class U12442 {
    static boolean[] visited ;
    static int[] edges ;
    static int[] distto ;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int C =  1;
        visited = new boolean[50001];
        edges = new int[50001];
        distto = new int[50001];

        PrintWriter pw  = new PrintWriter(System.out);
        while (T-->0)
        {
            int N = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < N  ;i++)
            {
                int v , w ;
                StringTokenizer st = new StringTokenizer(br.readLine());
                v = Integer.valueOf(st.nextToken());
                w = Integer.valueOf(st.nextToken());
                visited[v] = false;
                edges[v] = w;
                distto[v] = -1;
            }
            int x = 0;
            int len = 0;
            for(int i  = 1 ; i <= N ;i++)
            {
                if(distto[i] == -1)
                    dfs(i);
                if(distto[i]>len)
                {
                    len = distto[i];
                    x = i;
                }
            }
            pw.printf("Case %d: %d\n",C++,x);
        }
        pw.flush();
    }
    private static int dfs(int s)
    {
        int sum = 0 ;
        visited[s] = true;
        if(edges[s]!=-1 && !visited[edges[s]])
        {
            sum += 1+dfs(edges[s]);
        }
        distto[s] = sum;
        visited[s] = false;
        return sum;
    }

}
