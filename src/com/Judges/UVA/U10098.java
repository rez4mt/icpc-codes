package com.Judges.UVA;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class U10098 {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int T = fr.nextInt();
        while (T-->0)
        {
            String l = fr.nextLine();
            ArrayList<String> list = new ArrayList<>();
            long count = 1;
            for(int i = 0 ; i < l.length();i++)
            {
                list.add(l.substring(i,i+1));
                count *= (i+1);
            }
            Collections.sort(list);
            int[] current = new int[list.size()];
            for(int i = 0 ; i < list.size();i++)
                current[i] = i;

            HashSet<String> set = new HashSet<>();
            set.add(print(current,list));
            while (count-->1)
            {
                int j = current.length-2;
                while (current[j] > current[j+1])
                    j--;

                int k = current.length-1;
                while (current[j] > current[k])
                    k--;

                swap(j,k,current);
                sort(current,j+1);
                set.add(print(current,list));
            }
            //print all of them
            TreeSet<String> set1 = new TreeSet<>(set);
            for (String s :
                    set1) {
                System.out.println(s);
            }
            System.out.println();
        }
    }

    private static  String print(int[] list,ArrayList<String> vs)
    {
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i < list.length;i++)
            b.append(vs.get(list[i]));
        return b.toString();
    }
    private static void sort(int[] list,int i)
    {
        int right = list.length-1;
        while (i<right)
            swap(i++,right--,list);
    }
    private static void swap(int i , int j,int[] list )
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
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
