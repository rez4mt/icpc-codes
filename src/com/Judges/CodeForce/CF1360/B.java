package com.Judges.CodeForce.CF1360;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int[] list = new int[n];
            for(int i = 0 ; i < n; i++)
                list[i] = sc.nextInt();
            Arrays.sort(list);
            int diff = Integer.MAX_VALUE;
            for(int i = 1 ; i  < n ; i++)
            {
                diff = Math.min(diff , list[i]-list[i-1]);
            }
            System.out.println(diff);
        }
    }
}
