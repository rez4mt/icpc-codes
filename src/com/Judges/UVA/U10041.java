package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U10041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {

            int r = sc.nextInt();
            int[] x = new int[r];
            for(int i = 0 ; i < r ; i ++)
                x[i] = sc.nextInt();

            Arrays.sort(x);
            int med = x[r/2];
            int ans = 0 ;
            for(int i = 0; i < r ; i ++)
                ans += Math.abs(med - x[i]);

            System.out.println(ans);
        }
    }
}
