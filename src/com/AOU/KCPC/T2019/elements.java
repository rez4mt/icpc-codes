//package com.AOU.KCPC.T2019;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class elements {
    public static void main(String[] args) throws Exception {
        fr sc = new fr(new File("elements.in"));
        PrintWriter pw = new PrintWriter(System.out);
        //Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            char[] chars = sc.next().toCharArray();
            int op = sc.nextInt();
            while (op-->0)
            {
                int type = sc.nextInt();
                if(type == 0)
                {
                    chars[sc.nextInt()-1] = sc.next().charAt(0);
                }else
                {
                    pw.println(get(chars,sc.nextInt()-1,sc.nextInt()-1));
                }
            }
        }
        pw.flush();
        pw.close();
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
    static int get(char[] list , int start,int end)
    {
        int[] count = new int[list.length];
        if(start == 0)
        {
            count[0] = 1;
            start++;
        }

        for(int i = start ; i <= end ;i++)
        {
            if(list[i] == list[i-1])
                count[i] = count[i-1] + 1;
            else count[i] = 1;
        }
        return Arrays.stream(count).max().getAsInt();
    }
}
