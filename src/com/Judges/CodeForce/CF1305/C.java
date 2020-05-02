package com.Judges.CodeForce.CF1305;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C {
    public static void main(String[] args) throws Exception{
        fr sc = new fr();
        int n =sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0 ; i < n ; i++)
            list[i] = sc.nextInt();
        int ans = 1;
        if(n<=m)
        {
            for(int i = 0 ; i< n ;i++)
            {
                for(int j = i+1 ; j < n ;j++)
                {
                    ans = (int)(((Math.abs(list[i]-list[j]))*1l*ans)%m);
                }
            }
        }else ans = 0;
        System.out.println(ans);
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
}
