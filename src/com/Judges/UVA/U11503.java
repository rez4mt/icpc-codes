package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class U11503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T-->0)
        {
            HashMap<String,Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine().trim());
            UF uf = new UF(n*2);
            for(int i = 0 ; i < n; i ++)
            {
                String[] friends = br.readLine().split(" ");
                map.putIfAbsent(friends[0],map.size());
                map.putIfAbsent(friends[1],map.size());
                int index = map.get(friends[0]);
                uf.union(index,map.get(friends[1]));
                System.out.println(uf.size(index));
            }

        }

    }

    static class UF{
        int[] size;
        int[] parent;

        public UF(int n)
        {
            size = new int[n];
            parent = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                size[i] = 1;
                parent[i] = i;
            }
        }
        public int find(int p){
            while(p!=parent[p])
                p = parent[parent[p]];
            return p;
        }
        public void union(int p , int q)
        {
            int rootP = find(p);
            int rootQ = find(q);
            if(rootP == rootQ)
                return;
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        public int size(int p)
        {
            return size[find(p)];
        }
        public boolean connected(int p , int q)
        {
            return p == q || find(p) == find(q);
        }
    }
}
