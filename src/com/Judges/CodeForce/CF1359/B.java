package com.Judges.CodeForce.CF1359;
import java.util.*;
import java.io.*;

public class B {
    static PrintWriter pw ;
    public static void main(String[] args) throws Exception {
        fr sc = new fr();
        pw = new PrintWriter(System.out);

        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            long total_cost = 0 ;
            char[][] list = new char[n][];
            for(int i = 0 ; i < n ; i++)
                list[i] = sc.next().toCharArray();
            y = Math.min(y , 2*x);
            for(int i = 0 ; i < n ;i++)
            {
                for(int j = 0 ; j < m ; j++)
                {
                    if(list[i][j]=='.')
                    {
                        if( j != m-1 && list[i][j+1]=='.')
                        {
                            total_cost+=y;
                            j++;
                        }else
                        {
                            total_cost+=x;
                        }
                    }
                }
            }
            System.out.println(total_cost);
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
