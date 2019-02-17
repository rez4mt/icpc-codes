package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class U11292 {
    public static void main(String[] args) throws IOException {
        int N ,M;
        FR fr = new FR();
        while (true)
        {
            N = fr.nextInt();
            M = fr.nextInt();
            if(N==0 && M == 0)
                break;
            if(N > M)
            {
                System.out.println("Loowater is doomed!");
                continue;
            }
            int MIN = Integer.MAX_VALUE;
            PriorityQueue<Integer> drgHead = new PriorityQueue<>();
            PriorityQueue<Integer> knights = new PriorityQueue<>();
            for(int i = 0 ; i < N ; i++)
            {
                int aa = fr.nextInt();
                MIN = Math.min(MIN,aa);
                drgHead.add(aa);
            }
            for(int i = 0 ; i < M ; i++)
            {
                int aa = fr.nextInt();
                if(aa<MIN)
                    continue;
                knights.add(aa);
            }
            if(knights.size() < drgHead.size())
            {
                System.out.println("Loowater is doomed!");
                continue;
            }
            long cost = 0;
            while (!knights.isEmpty() && !drgHead.isEmpty())
            {
                int drg = drgHead.peek();
                int knight = knights.poll();
                if(knight < drg)
                    continue;
                cost+=knight;
                drgHead.poll();
            }
            if(knights.isEmpty() && !drgHead.isEmpty())
            {
                System.out.println("Loowater is doomed!");
            }else{
                System.out.println(cost);
            }
        }
    }

    static class FR{
        StringTokenizer st;
        BufferedReader br ;
        public FR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
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
            return Integer.parseInt(next());
        }
    }
}
