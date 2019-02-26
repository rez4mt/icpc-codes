package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class U11342 {
    static int MAX = 50000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        HashMap<Integer,N> vals = new HashMap<>();
        for(int i = 0 ; i*i <= MAX ;i++)
        {
            int i2 = i*i;
            for(int j = 0 ; i2 + j*j <=MAX;j++)
            {
                int j2 = j*j;
                for(int k = 0 ; k*k + j2 + i2 <= MAX ; k++)
                {
                    int res = i2+j2+k*k;
                    if(vals.containsKey(res))
                        continue;
                    vals.put(res,new N(i,j,k));
                    //vals.put(res,String.format("%d %d %d",i,j,k));
                }
            }
        }
        int T = Integer.parseInt(br.readLine());
        while (T-->0)
        {
            int N = Integer.parseInt(br.readLine());
            if(vals.containsKey(N))
            {
                pw.println(vals.get(N));
            }else
            {
                pw.println(-1);
            }
        }
        pw.flush();
    }
    static class N{
        int a,b,c;
        public N(int a,int b,int c)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString() {
            int[] aa = new int[]{a,b,c};
            Arrays.sort(aa);
            //return String.format("%d %d %d",aa[0],aa[1],aa[2]);
            return aa[0] + " " + aa[1] +" "+aa[2];
        }
    }
}
