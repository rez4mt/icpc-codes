package com.ICPC.AOU.P18;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int R ,S,X,Y;
            R = sc.nextInt();
            S = sc.nextInt();
            X = sc.nextInt();
            Y = sc.nextInt();
            double place = Math.atan((double) Y/(double)X);
            if(Y<0 && X<0) place-=Math.PI;
            double a = (Math.PI/place);
            System.out.println((int)(a<0?S+a:a));
        }
    }
}
