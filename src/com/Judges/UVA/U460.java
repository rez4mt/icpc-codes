package com.Judges.UVA;

import java.awt.*;
import java.util.Scanner;

public class U460 {
    public static void main(String[] args) {
        Point a,b,c,d;
        int T ;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T-->0)
        {
            a = new Point(sc.nextInt(),sc.nextInt());
            b = new Point(sc.nextInt(),sc.nextInt());
            c = new Point(sc.nextInt(),sc.nextInt());
            d = new Point(sc.nextInt(),sc.nextInt());
            int i,j,k,l;
            i = Math.max(a.x,c.x);
            j = Math.max(a.y,c.y);
            k = Math.min(b.x,d.x);
            l = Math.min(b.y,d.y);
            if(i >= k || j >= l)
                System.out.println("No Overlap");
            else
                System.out.printf("%d %d %d %d\n", i, j, k, l);
            if(T>0)
                System.out.println();
        }
    }
}
