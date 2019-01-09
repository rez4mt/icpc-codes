package com.Judges.UVA;

import java.util.Scanner;

public class U12578 {
    public static void main(String[] args) {
        double PI = Math.acos(-1);
        Scanner sc = new Scanner(System.in);
        int tCase = sc.nextInt();
        int l ;
        double rect,cir,h,r;
        for(int i = 0 ; i <tCase ;i++)
        {
            l = sc.nextInt();
            h = l*6/10d;
            r = l / 5d;
            rect = l*h;
            cir = r*r*PI;
            System.out.printf("%.2f %.2f\n",cir,rect-cir);

        }
    }
}
