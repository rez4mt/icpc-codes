package com.Judges;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            UF uf = new UF(N);
            int T = sc.nextInt();
            int ans = 0 ;
            while(T-->0)
            {
                int a , b;
                a = sc.nextInt();
                b=  sc.nextInt();
                if(!uf.connected(a,b))
                {
                    uf.union(a,b);
                }
            }
        }

    }
    static class UF{
        int[] ids;
        public UF(int n)
        {
            ids = new int[n];
            for(int i = 0 ; i < n ; i++)
                ids[i] = i;
        }

        public int find(int id)
        {
            while (id != ids[id])
            {
                id = ids[ids[id]];
            }
            return id;
        }
        public void union(int p,int q)
        {
            int rootq = find(q);
            int rootp = find(p);
            if(rootp == rootq)
                return;
            ids[rootq] = rootp;
        }
        public boolean connected(int p,int q)
        {
            return find(p) == find(q);
        }
    }
}