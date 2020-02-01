package com.Judges.kattis;

import java.util.*;

public class commercials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] list = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            list[i] = sc.nextInt();
        }
        int best = 0 ;
        int sum = 0 ;
        for(int i = 0 ; i < N ; i++)
        {
            sum = Math.max(list[i]-T , sum+list[i]-T);
            best = Math.max(best , sum);
        }
        System.out.println(best);
    }
}
