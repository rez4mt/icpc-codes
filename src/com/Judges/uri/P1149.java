package com.Judges.uri;

import java.util.Scanner;

public class P1149 {
    public P1149()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,sum =0;
        a = sc.nextInt();
        b = sc.nextInt();
        while (b <= 0)
            b = sc.nextInt();
        for(int i = 1 ; i <= b ; i++)
        {
            sum+=a;
            a++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new P1149();
    }
}
