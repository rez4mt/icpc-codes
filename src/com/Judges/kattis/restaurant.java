package com.Judges.kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class restaurant {
    public static void main(String[] args) throws Exception {
        FR sc = new FR();
        boolean first = true;
        PrintWriter pw = new PrintWriter(System.out);
        while (true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            if(!first)
                pw.println();
            first = false;
            int a , b;
            a = b = 0;
            while (N-->0)
            {

                String[] line = sc.nextLine().split(" ");
                if(line[0].equals("DROP"))
                {
                    pw.println("DROP 2 "+line[1]);
                    b += Integer.parseInt(line[1]);
                }else if(line[0].equals("TAKE"))
                {
                    int c = Integer.parseInt(line[1]);
                    if(a >= c)
                    {
                        a -= c;
                        pw.println("TAKE 1 "+c);
                    }else{
                        if(a!=0)
                        {
                            pw.println("TAKE 1 "+a);
                            c-=a;
                        }
                        pw.println("MOVE 2->1 "+b);
                        pw.println("TAKE 1 "+c);
                        a = b - c;
                        b = 0 ;
                    }
                }
            }
        }
        pw.flush();
    }
    static class FR{
        BufferedReader br;
        StringTokenizer st;
        public FR()
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
        public double nextDouble() throws Exception
        {
            return Double.parseDouble(next());
        }
        public String nextLine() throws Exception
        {
            return br.readLine();
        }
    }
}
