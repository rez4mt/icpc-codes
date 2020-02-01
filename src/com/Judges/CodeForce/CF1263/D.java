package com.Judges.CodeForce.CF1263;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        UF uf = new UF(27);
        for(int i = 0 ; i < N ; i++)
        {
            String s = sc.next();
            for(int j = 0 ; j < s.length() ;j++)
            {
                uf.find(s.charAt(j)-'a');
                if(j+1 < s.length())
                    uf.union(s.charAt(j)-'a' , s.charAt(j+1)-'a');

            }
        }
        HashSet<Integer> roots = new HashSet<>();
        for(int i = 0 ; i < 27 ; i++)
        {
            if(uf.ids[i] == -1)
                continue;
            int a = uf.find(i);
            roots.add(a);
        }
        System.out.println(roots.size());

    }
    static class UF{
        int[] ids;
        public UF(int n)
        {
            ids = new int[n];
            for(int i = 0 ; i < n ; i++)
                ids[i] = -1;
        }

        public int find(int id)
        {
            if(ids[id] == -1)
            {
                ids[id] = id;
                return id;
            }

            while (id != ids[id])
            {
                id = ids[id];
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