package com.Judges.CodeForce.CF1359;
import java.util.*;
import java.io.*;

public class C {
    static PrintWriter pw ;
    public static void main(String[] args) throws Exception {
        fr sc = new fr();
        pw = new PrintWriter(System.out);

        int T = sc.nextInt();
        while (T-->0)
        {
            int h = sc.nextInt();
            int c = sc.nextInt();
            int t = sc.nextInt();
            int ht = Math.abs(h-t);
            int ct = Math.abs(t-c);
            if(h==t)
            {
                System.out.println(1);
                continue;
            }
            if(ht == ct)
            {
                System.out.println(2);
                continue;
            }
            double upper = (h+h+c) / 3d;
            double lower = (h+c) /2d;
            if(t<upper && t>lower)
            {
                double min = Math.abs(t - ((c+h)/2d)) ;
                for(int i = 2; i < 10e6; i++)
                {
                    double cc = ((i*h) + ((i-1d)*c)) / (( i + (i-1))*1d);
                    if( Math.abs(t-cc) < Math.abs(min-t) )
                    {
                        min = cc;
                    }else
                    {
                        System.out.println((i-1)+(i-2));
                        break;
                    }
                }
            } else
            {
                //either 1 or 2!
                double min = Math.abs(h-t);
                int ans = 1;
                if(Math.abs(upper-t) < min)
                {
                    ans = 3;
                    min = Math.abs(upper-t);
                }

                if(Math.abs(lower-t) < min)
                {
                    ans = 2;
                }
                System.out.println(ans);

            }
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
