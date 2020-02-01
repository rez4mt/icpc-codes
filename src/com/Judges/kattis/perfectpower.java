package com.Judges.kattis;

import java.io.*;
import java.util.*;

public class perfectpower {

    public static void main(String[] args)throws Exception {
        fr sc = new fr();
        PrintWriter pw = new PrintWriter(System.out);
        while (true) {
            int n = sc.nextInt();
            if(n == 0)
                break;
            int sqrt = (int)Math.sqrt(n);
            boolean flag = false;
            if(n%2==0)
            {
                flag = true;
            }else
            {
                for(int i = 3 ; i <= sqrt;i+=2)
                    if(n%i==0)
                    {
                        flag = true;
                        break;
                    }
            }
            if(flag) {
                flag = false;
                for (int i = 2; i <= sqrt; i++) {
                    double x = Math.log(n) / Math.log(i);
                    if (x == (int) x) {
                        pw.println((int) x);
                        flag = true;
                        break;
                    }
                }
                if(!flag)
                    pw.println(1);
            }
            else pw.println(1);
        }
        pw.flush();
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
    }
    static BitSet bits;
    public static int sieve(int n) {
        bits = new BitSet(n);
        bits.clear();
        bits.flip(0, n);
        double csqrtn = Math.ceil(Math.sqrt(n));
        for (int i = 2; i < csqrtn; ++i)
            if (bits.get(i))
                for (int j = i * i; j < n && j>i; j += i)
                {
                    bits.set(j, false);
                }
        return bits.cardinality() - 2;
    }
}
