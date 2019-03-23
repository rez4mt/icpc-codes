package com.Judges.a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class A419{
    public static void main2(String[] args) throws IOException
    {
        FR sc = new FR();
        PrintWriter pw = new PrintWriter(System.out);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            mPair[] list = new mPair[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = new mPair(sc.nextInt(),sc.nextInt());
            Arrays.sort(list);
            long last = list[0].end;
            long sum = list[0].end - list[0].start;
            for(int i = 1 ; i < N ; i++)
            {
                mPair temp = list[i];
                if(temp.start < last)
                {
                    if(temp.end <= last)
                        continue;
                    sum += (temp.end - last);
                    last = temp.end;
                    continue;
                }
                sum += (temp.end - temp.start);
                last = temp.end;
            }
            pw.println(sum);
        }
        pw.flush();
    }
    static class mPair implements Comparable<mPair>{
        @Override
        public int compareTo(mPair o) {
            return Long.compare(start,o.start);
        }

        @Override
        public String toString() {
            return String.format("%s %s",start,end);
        }

        long start,end;
        public mPair(long s,long e)
        {
            start = Math.min(s,e);
            end = Math.max(s,e);
        }

    }

    public static void main(String[] args) throws IOException{
        FR sc = new FR();
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            PriorityQueue<Custom> q = new PriorityQueue<>();
            for(int i = 0 ; i < N;i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if(x>y)
                {
                    q.offer(new Custom(y,true)) ;
                    q.offer( new Custom(x,false));
                }else
                {
                    q.offer(new Custom(x,true)) ;
                    q.offer( new Custom(y,false));
                }

            }
            long sum =0;
            while (!q.isEmpty())
            {
                Custom v = q.poll();
                if(!v.start)
                    continue;
                int current = 1;
                int start = v.val;
                while (current!=0)
                {
                    v =q.poll();
                    if(v.start)
                        current++;
                    else current--;
                }
                sum+= (v.val - start);
            }
            System.out.println(sum);
        }
    }
    static class Custom implements Comparable<Custom>
    {
        int val;
        boolean start;
        @Override
        public int compareTo(Custom o) {
            return Integer.compare(val,o.val);
        }
        public Custom(int val,boolean start)
        {
            this.val = val;
            this.start = start;
        }

        @Override
        public String toString() {
            return String.format("[%d %s],",val,start?"start":"end");
        }
    }
    static class FR{
        BufferedReader br ;
        StringTokenizer st;
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
            return Integer.valueOf(next());
        }
        public long nextLong() throws IOException
        {
            return Long.parseLong(next());
        }
    }
}