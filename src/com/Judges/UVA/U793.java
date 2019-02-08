package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U793 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        bf.readLine();
        int c = 0;
        while (T-->0)
        {
            if(c++!=0)
                System.out.println();
            UF uf = new UF(Integer.parseInt(bf.readLine()));
            String data ;
            int suc = 0 , fail = 0;
            while ((data = bf.readLine())!=null)
            {
                if(data.equals(""))
                    break;
                StringTokenizer st = new StringTokenizer(data);
                if(st.nextToken().equals("c"))
                {
                    uf.union(Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken())-1);
                }else{
                    if(uf.connected(Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken())-1))
                        suc++;
                    else fail++;
                }
            }
            System.out.printf("%d,%d\n",suc,fail);
        }

    }
    static class UF
    {
        int[] id;
        public UF(int n)
        {
            id = new int[n];
            for(int i = 0; i <n ; i ++)
            {
                id[i] = i;
            }
        }
        public void union(int p , int q)
        {
            int rootP = find(p);
            int rootQ = find(q);
            if(rootP == rootQ)
                return;
            id[rootQ] = rootP;
        }
        public int find(int p)
        {
            while (p!=id[p])
                p = id[id[p]];
            return p;
        }
        boolean connected(int p,int q)
        {
            return p==q || find(p) == find(q);
        }
    }
}
