package com.Judges.CodeForce.CF1311;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class D {
    public static void main(String[] args)  throws Exception{
        fr mc = new fr();
        int T = mc.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        obj[] list = new obj[10000000];
        int N = 0 ;
        for(int i = 1 ; i < 10100;i++)
        {
            for(int j = i ; j < 10100 ;j+=i)
            {
                for(int k = j ; k < 10100 ; k+=j)
                {
                   list[N++] = new obj(i,j,k);
                }
            }
        }
        while (T-->0)
        {
            int a = mc.nextInt();
            int b = mc.nextInt();
            int c = mc.nextInt();
            int ans = 0;
            int min = Integer.MAX_VALUE ;
            for(int i = 0 ; i < N ; i++)
            {
                int aa = Math.abs(list[i].a-a)+Math.abs(list[i].b-b)+Math.abs(list[i].c-c);
                if(aa<min)
                {
                    min = aa;
                    ans = i ;

                }
            }
            pw.println(min);
            pw.println(list[ans].a+" "+list[ans].b+" "+list[ans].c);
        }

        pw.flush();
    }
    static class obj{
        int a , b , c;
        public obj (int x , int y , int z )
        {
            a = x;
            b = y;
            c = z;
        }
    }
    static class fr{
        BufferedReader br;
        StringTokenizer st;
        public fr(File f) throws Exception
        {
            br = new BufferedReader(new FileReader(f));
        }
        public fr()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() throws Exception
        {
            if(st == null || !st.hasMoreTokens())
            {
                st = new StringTokenizer(br.readLine());
                return next();
            }
            return st.nextToken();
        }
        public int nextInt() throws Exception
        {
            return Integer.valueOf(next());
        }
        public long nextLong() throws Exception{
            return Long.parseLong(next());
        }
    }

}
