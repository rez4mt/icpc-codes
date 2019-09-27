//package com.AOU.KCPC.T2019.Training3;


import java.io.*;
import java.util.*;

public class smallest {

    static class FR{
        BufferedReader br ;
        StringTokenizer st;
        public FR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public FR(File f) throws Exception
        {
            br = new BufferedReader(new FileReader(f));
        }
        public String next() throws IOException
        {
            if(st == null || !st.hasMoreTokens())
            {
                st = new StringTokenizer(br.readLine());
                return next();
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException
        {
            return Integer.valueOf(next());
        }
        public long nextLong() throws IOException
        {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FR sc = new FR(new File("smallest.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            HashMap<key,Integer> numbers = new HashMap<>();
            key[] nums = new key[N];
            for(int i = 0 ; i < N; i++)
            {
                long v = sc.nextLong();
                nums[i] = new key(v);
                if(numbers.containsKey(nums[i]))
                    continue;
                numbers.put(nums[i],0);
            }
            int k = numbers.size();
            int current = 0  ;
            int smallest = Integer.MAX_VALUE ;
            for(int i = 0, j = 0 ; i < N ; i++)
            {
                int n = numbers.get(nums[i]);
                if( n == 0)
                {
                    current++;
                }
                numbers.put(nums[i] , n+1);
                if(current == k)
                {
                    while (current == k && j <= i )
                    {
                        smallest = Math.min(smallest ,i - j + 1 );
                        if(numbers.get(nums[j]) == 1){
                            current -- ;
                        }
                        numbers.put(nums[j],numbers.get(nums[j])-1);
                        j++;
                    }

                }
            }
            System.out.println(smallest);
        }
    }
   static class key{
        long v ;
        public key(long v)
        {
            this.v = v;
        }

       @Override
       public boolean equals(Object obj) {
           return v == ((key)obj).v;
       }

       @Override
       public int hashCode() {
           return (int)v ;
       }

   }
}
