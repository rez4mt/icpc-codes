package com.Judges.uri;

import java.util.Scanner;

public class P1541 {
    public P1541()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        while (a!=0)
        {
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.printf("%d\n",(int)Math.pow((double) (a*b*100)/(double)c,0.5));
            a = sc.nextInt();
        }
    }


    public static void main(String[] args) {
        new P1541();
    }
}
