package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U12321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int L = sc.nextInt();
            int G = sc.nextInt();
            if(L == 0 && G == 0)
                break;
            Gs[] list = new Gs[G];
            for(int i = 0 ; i < G ; i++)
                list[i] = new Gs(sc.nextInt(),sc.nextInt());
            Arrays.sort(list);
            int a = 0 ,count = 0,current = 0;
            while (a<L)
            {
                int max = a ;
                while ( current < G && list[current].start<=a)
                {
                    max = Math.max(list[current++].end,max);
                }
                if(max == a)
                    break;
                a = max;
                count++;
            }
            if(a<L)
                System.out.println("-1");
            else
                System.out.println(G-count);
        }
    }
    static class Gs implements Comparable<Gs>{
        @Override
        public int compareTo(Gs o) {

            if(this.start!=o.start)
                return this.start - o.start;
            return o.end - this.end;
        }

        int start , end ;
        public Gs(int x , int r)
        {
            start   = x - r ;
            end     = x + r;

        }
    }
}
