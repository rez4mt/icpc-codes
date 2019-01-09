package com.Judges.uri;

import java.util.Scanner;

public class P1176 {
    public static void main(String[] args) {
        new P1176();
    }
    public P1176()
    {
        Scanner sc = new Scanner(System.in);
        long[] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;
        int last = 0,sum = 1,temp = 0;
        for(int i = 2 ; i <61;i++)
            fib[i] = fib[i-2]+fib[i-1];
        int loop = sc.nextInt();
        int num;
        for(int i = 0 ; i < loop ; i++)
        {
            num = sc.nextInt();
            System.out.printf("Fib(%d) = %d\n",num,fib[num]);
        }
    }


}
