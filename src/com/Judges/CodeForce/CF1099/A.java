package com.Judges.CodeForce.CF1099;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        int h = sc.nextInt();
        int u1 = sc.nextInt();
        int d1 = sc.nextInt();
        int u2 = sc.nextInt();
        int d2 = sc.nextInt();
        for(int i = h ; h >=0 ; h--)
        {
            w += h;
            if(d1 == h)
            {
                w -= u1;
                if(w<0)
                    w = 0;
            }else if(d2 == h)
            {
                w -= u2;
                if(w<0)
                    w = 0;
            }
        }
        System.out.println(w);
    }
}
