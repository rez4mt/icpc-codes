package com.ICPC.Sharif.P97;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,d;
        n = sc.nextInt();
        d = sc.nextInt();
        int[] pos = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            pos[i] = sc.nextInt();
        }

        int min = pos[0],max = pos[0];
        for(int i = 1; i < n ; i++)
        {
            min = Math.min(min,pos[i]);
            max = Math.max(max,pos[i]);
        }
        int m = max - min;
        System.out.println((m/d)+(m%d==0?0:1));
    }
}
