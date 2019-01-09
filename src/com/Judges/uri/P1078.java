package com.Judges.uri;

import java.util.Scanner;

public class P1078 {
    public P1078()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d\n",i,n,i*n);
        }
    }

    public static void main(String[] args) {
        new P1078();
    }
}
