package com.Judges.uri;

import java.util.Scanner;

public class P1177 {
    public static void main(String[] args) {
        new P1177();
    }
    public P1177()
    {
        int n[] = new int[1000];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 0;
        for(int i = 0 ; i < 1000; i ++)
        {
            if(c == num)
                c = 0;
            n[i] = c;
            System.out.printf("N[%d] = %d\n",i,c);
            c ++;
        }
    }
}
