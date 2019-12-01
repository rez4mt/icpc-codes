package com.AOU.ACPC.T2019.T4;

import java.io.File;
import java.util.*;

public class I {
    public static void main(String[] args) throws Exception{
        //Scanner sc = new Scanner(new File("icecream.in"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-->0)
        {
            int N  = sc.nextInt();
            int K = sc.nextInt();
            ice[] list = new ice[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = new ice(0,sc.nextInt());
            for(int i = 0 ; i < N  ; i++)
                list[i].h = sc.nextInt();
            Arrays.sort(list);
            int maxC = list[K - 1].c;
            ArrayList<ice> icelist = new ArrayList<>();
            for(int i = 0 ; i < N ; i++)
            {
                if( list[i].c > maxC)
                    break;
                icelist.add(list[i]);
            }
            Collections.sort(icelist , new Comparator<ice>() {
                @Override
                public int compare(ice o1, ice o2) {
                    return o2.h - o1.h;
                }
            });
            long currentk =  0 ;
            for(int i = 0 ; i < K ; i++)
            {
                currentk += icelist.get(i).h;
            }
            System.out.println(maxC+ " "+currentk);
        }
    }
    static class ice implements Comparable<ice>{
        int h , c ;
        @Override
        public int compareTo(ice o) {
            return Integer.compare(c , o.c);
        }
        public ice(int h , int c)
        {
            this.h = h ;
            this.c = c;

        }
    }
}
