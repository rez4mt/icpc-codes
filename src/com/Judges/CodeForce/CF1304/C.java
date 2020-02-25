package com.Judges.CodeForce.CF1304;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-->0)
        {
            int n = sc.nextInt();
            int temp = sc.nextInt();
            int lt = 0;
            int min = temp;
            int max = temp;
            obj[] list = new obj[n];
            for(int i = 0 ; i < n;i++)
                list[i] = new obj(sc.nextInt(),sc.nextInt() , sc.nextInt());
            Arrays.sort(list);
            boolean flag = true;
            for(int i = 0 ; i < n ; i++)
            {
                min -= (lt - list[i].t);
                max += (lt + list[i].t);
                min = Math.max(min , list[i].l);
                max = Math.min(max , list[i].h);
                if(min>max)
                    flag = false;
            }
            if(!flag)
                System.out.println("NO");
            else System.out.println("YES");


        }
    }
    static class obj implements Comparable<obj>{
        @Override
        public int compareTo(obj o) {
            return Integer.compare(t,o.t);
        }

        int t , l , h;
        public obj(int t , int l , int h)
        {
            this.t = t;
            this.l = l ;
            this.h = h;
        }
    }
}
