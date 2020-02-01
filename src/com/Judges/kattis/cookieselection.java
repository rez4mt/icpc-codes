package com.Judges.kattis;
import com.ICPC.KCPC.K2019.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class cookieselection {
    /*public static void main(String[] args) {
        FR sc = new FR();
        //ArrayList<Integer> list = new ArrayList<>(600);
        int[] frq = new int[32];
        PrintWriter pw = new PrintWriter(System.out);
        try{
            int size = 0 ;
            while (true)
            {
                String s = null;
                s = sc.next();
                if(s.charAt(0)=='#')
                {
                    long idx =(int) Math.ceil((size+1)/2d);
                    long current=  0 ;
                    for(int i = 0 ; i <= 31 ; i++)
                    {
                        current+=frq[i];
                        if(current>=idx)
                        {
                            size--;
                            pw.println(i);
                            frq[i]--;
                            break;
                        }
                    }
                    //print out and remove
                    *//*if(list.size() %2 == 0)
                    {
                        //(c/2)+1
                        int idx = ((list.size())/2)  +1 ;
                        int item = list.get(idx-1);
                        list.remove(idx-1);
                        pw.println(item);
                    }else
                    {
                        int idx = ((list.size()+1) / 2) ;
                        int item = list.get(idx-1);
                        list.remove(idx-1);
                        pw.println(item);
                    }*//*
                }else
                {
                    int is = Integer.valueOf(s);
                    frq[is]++;
                    size++;
                    *//*int is = Integer.parseInt(s);
                    int idx = Collections.binarySearch(list,is);
                    if(idx<0)
                        idx = -idx-1;
                    list.add(idx , is);*//*
                }

            }
        }catch (Exception e){

        }
        pw.flush();
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String s = sc.next();
            if(s.equals("#"))
            {
                //print something
            }else
            {
                //add to pq
            }
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
