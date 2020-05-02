package com.Judges.CodeForce.CF1339;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            long[] list = new long[N];
            for(int i = 0 ; i< N ; i++)
                list[i] = sc.nextInt();
            long max = Integer.MIN_VALUE;
            long ans = 0 ;
            for(int i = 0 ; i < N ; i++)
            {
                max = Math.max(max , list[i]);
                ans = Math.max(ans , max - list[i]);
            }
            if(ans<=0)
                System.out.println(0);
            else
            System.out.println((int)((Math.log10(ans)/Math.log10(2))+1));
        }
    }
}