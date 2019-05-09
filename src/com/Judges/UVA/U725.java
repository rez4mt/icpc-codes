package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U725 {
    public static void main(String[] args) throws IOException{
        FastReader fr = new FastReader();
        int[] list = {0,1,2,3,4,5,6,7,8,9};
        int FAC = 3628800;
        while (true)
        {
            int N = fr.nextInt();
            if(N == 0)
                break;
            //calculate it
            //test every TC
            for(int i = 0 ; i < FAC ; i++)
            {
                int j = 8;
                while (j>0 && list[j] > list[j+1])
                    j--;
                if(j==0 &&list[j]>list[j+1])
                    continue;
                int k = 9;
                while ( k>=0 && list[j] > list[k])
                    k--;
                if(k==0 && list[j]>list[k])
                    continue;
                swap(j,k,list);
                sort(j+1,list);

                System.out.println(check(list,N));
            }
        }
    }
    private static boolean check(int[] list,int N)
    {
        //first 5 nums with the second
        int f = 0,s = 0;
        for(int i = 0 ; i < 5 ; i++)
        {
            f *=10;
            f += list[i];
        }
        for(int i = 4 ; i < 10 ; i++)
        {
            s *=10;
            s += list[i];
        }
        return f/s == N;
    }

    private static void swap(int i , int j , int[] list)
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    private static void sort(int i , int[] list)
    {
        int j = list.length-1;
        while (i<j)
            swap(i++,j--,list);
    }
    static class FastReader {
            BufferedReader br;
            StringTokenizer st;
            FastReader() { // To read from the standard input
                br = new BufferedReader(new InputStreamReader(System.in));
            }
            // You can add a constructor to read from a file
            /////
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
        } //end FastReader

}
