package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class U11286 {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        while (true)
        {
            int n =fr.nextInt();
            if(n==0)
                break;
            int MAX = -1;
            HashMap<String,Integer> counts = new HashMap<>();

            for(int i = 0 ; i < n ; i++)
            {
                N myN = new N(fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt());
                counts.put(myN.get(),counts.getOrDefault(myN.get(),0)+1);
            }
            int c = 0;
            for (int v :
                    counts.values()) {
                if(v> MAX)
                {
                    MAX = v;
                    c = v;
                }else if(MAX == v)
                {
                    c+=v;
                }
            }
            System.out.println(c);
            //System.out.println(MAX);
        }

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
    static class N{
        int[] nums;
        public N(int a,int b,int c,int d,int e)
        {
            nums = new int[]{a,b,c,d,e};
            Arrays.sort(nums);
        }
        public String get()
        {
            return nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]+" "+nums[4]+" ";
        }
    }

}
