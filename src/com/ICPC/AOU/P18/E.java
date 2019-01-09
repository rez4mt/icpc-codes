package com.ICPC.AOU.P18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class E {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        //long start = System.currentTimeMillis();
        //boolean first = true;
        int c = 1;
        StringBuilder b = new StringBuilder();
        while (in.hasNext())
        {
            /*if(first)
            {
                first = false;
                start = (System.currentTimeMillis());
            }*/
            int n = in.nextInt();
            if(n == 0)
                break;
            boolean process = true;
            if(n==1)
                process = false;
            int[][] mat = new int[n][n];
            for(int i = 0 ; i < n ; i ++)
            {
                for(int j = 0 ; j < n ; j ++)
                    mat[i][j] = in.nextInt();
            }
            //for(int i = 0 ; i < 100000;i++)
            if(process)
                process = process(mat);
            //System.out.println(process);
            b.append(String.format("%d. %s\n",c++,process?"Found":"Not Found"));
        }
        //System.out.println(System.currentTimeMillis()-start);
        System.out.println(b);

    }
    //first process method
    private static boolean process(int[][] mat)
    {
        int n = mat.length;
        boolean found = false;
        for(int i = 0 ; i < n && !found; i ++)
        {
            for(int i2 = 0 ; i2<n && !found;i2++)
            {
                int last_pos = 0;
                while (!found &&  last_pos<=n-1)
                {
                    int index = search(mat[i2],last_pos,n,mat[i][0]);
                    if(index < 0)
                    {
                        last_pos ++;
                        continue;
                    }
                    if(index == 0)
                    {
                        found = (i!=i2 && Arrays.equals(mat[i],mat[i2])) || Arrays.equals(mat[i],getCol(mat,index));

                    }else if(index == n-1)
                    {
                        found =( i!=i2 && Arrays.equals(mat[i],getRev(mat[i2]))) || Arrays.equals(mat[i],getColRev(mat,index));

                    }else
                    {
                        found = (i==0 && Arrays.equals(mat[i],getCol(mat,index))) || (i==n-1 && Arrays.equals(mat[i],getColRev(mat,index)));

                    }
                    last_pos++;
                }

            }
        }
        return found;
    }
    private static int search(int[] mat,int from,int to,int key)
    {
        for(int i = from;i<to;i++)
        {
            if(mat[i]==key)
                return i;
        }

            return -1;
    }
    private static int[] getColRev(int[][] mat,int pos)
    {
        int n = mat.length;
        int[] dest = new int[n];
        for(int i = 0; i < n ; i++)
        {
            dest[n-1-i] = mat[i][pos];
        }
        return dest;
    }
    private static int[] getCol(int[][] mat,int position)
    {
        int n = mat.length;
        int[] dest = new int[n];
        for(int i = 0 ; i < n ; i++)
            dest[i] = mat[i][position];
        return dest;
    }
    private static int[] getRev(int[] src)
    {
        int n = src.length;
        int[] dest = new int[n];
        for(int i = 0 ;i < n ; i++)
        {
            dest[i] = src[n-1-i];

        }
        return dest;
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { // To read from the standard input
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        String nextLine() throws IOException { return br.readLine(); }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        //You can add nextDouble() etc...
        boolean hasNext() throws IOException { // if input is terminated by EOF
            String s = br.readLine();
            if (s == null) return false;
            st = new StringTokenizer(s);
            return true;
        }
    }

}
