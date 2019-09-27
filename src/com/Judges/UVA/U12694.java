package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class U12694 {
    static Pairs[] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        list = new Pairs[21];
        while (T-->0)
        {

            int N = 0 ;
            while (true)
            {
                Pairs p = new Pairs(sc.nextInt(), sc.nextInt());
                if(p.s == 0 && p.e == 0)
                    break;
                list[N++] = p;

            }
            Arrays.sort(list,0 , N+1);
            System.out.println(check(N , -1));
        }
    }
    public static int check(int N, int r)
    {
        int result = 0 ;
        for(int i = 0 ; i < N ; i++)
        {
            if(!list[i].used && list[i].s>=r)
            {
                list[i].used = true;
                result = Math.max(check(N , list[i].e) + 1, result);
                list[i].used = false;
            }
        }
        return result ;
    }
    static class Pairs implements Comparable<Pairs>{
        int s , e , d ;
        boolean used = false;
        public Pairs (int s , int e )
        {
            this.s = s;
            this.e = e;
            d = e-s;
        }
        @Override
        public int compareTo(Pairs o) {
            if(d - o.d == 0)
                return s - o.s;
            return d - o.d;
        }

        @Override
        public String toString() {
            return "[ "+s+" , "+e+" ]";
        }
    }
}
