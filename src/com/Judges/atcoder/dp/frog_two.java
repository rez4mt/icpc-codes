package com.Judges.atcoder.dp;

import java.util.Arrays;
import java.util.Scanner;

public class frog_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int K = sc.nextInt();
        int[] list = new int[T];
        for(int i = 0 ; i < T ; i++)
            list[i] = sc.nextInt();
        int[] path = new int[T];
        path[0] = 0;
        for(int i = 1 ; i < T ; i ++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 1 ; j < K && i - j >= 0 ;j++)
            {
                min = Math.min(path[i-j]+(Math.abs(list[i]-list[i-j])) ,min);
            }
            path[i] = min;
        }
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(path));
        System.out.println(path[T-1]);
    }
}
