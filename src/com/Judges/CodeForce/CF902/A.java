package com.Judges.CodeForce.CF902;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end_point , n ;
        n = sc.nextInt();
        end_point = sc.nextInt();
        Points[] list = new Points[n];
        for(int i = 0 ; i < n ; i++)
        {
            list[i]= new Points(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(list);
        int current_r = end_point;
        for(int i = 0 ; i < n ; i++)
        {
            if(list[i].l < current_r)
            {
                System.out.println("NO");
                return ;
            }
            current_r = Math.min(list[i].r,current_r);
            if(current_r == 0)
                break;
        }
        if(current_r == 0)
        {
            System.out.println("YES");
        }else System.out.println("NO");

    }
   static class Points implements Comparable<Points>{
        int r , l;
        public Points(int x , int y)
        {
            this.r = x;
            this.l = y;

        }

        @Override
        public int compareTo(Points o) {
            return Integer.compare(o.l,l);
        }

        @Override
        public String toString() {
            return "["+r+","+l+"]";
        }
    }
}
