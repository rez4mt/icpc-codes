package com.ICPC.CoachAcademy.Placement;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class K {
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
    }
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        fr sc = new fr();
        int MX = (int)(5*10e5) + 5;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] list= new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            list[i] =sc.nextInt();
        }
        int[] frq = new int[MX];
        int count = 0 ;
        int xi = 0 , yi = 0;
        for(int i = 0 , j = 0 ; i < N ; i++)
        {
            if(frq[list[i]]++ == 0)
            {
                count++;
            }
            while (count>K)
            {
                frq[list[j]]--;
                if(frq[list[j]] == 0)
                    count--;
                j++;
            }
            if(Math.abs(j-i) > Math.abs(xi-yi))
            {
                xi = i ;
                yi = j;
            }

        }
        pw.println((yi+1) +" "+(xi+1));
        pw.flush();
    }
}
