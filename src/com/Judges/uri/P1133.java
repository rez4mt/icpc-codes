package com.Judges.uri;

import java.util.Scanner;

public class P1133 {
    public P1133()
    {
        int a,b,t;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        t = a;
        a = Math.min(a,b);
        b = Math.max(t,b);
        for( int i = a+1 ; i < b ; i++ )
        {
            if(i%5 == 2 || i%5 == 3)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        new P1133();
    }
}
