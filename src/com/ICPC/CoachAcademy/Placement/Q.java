package com.ICPC.CoachAcademy.Placement;

import java.util.Arrays;
import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] list = new int[N];
        for(int i = 0 ; i < N ; i++)
            list[i] = sc.nextInt();
        int[] map = new int[N+2];
        while (Q-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a-1]++;
            map[b]--;
        }
        for(int i = 1 ; i <= N+1 ; i++)
            map[i] = map[i-1] + map[i];
        Arrays.sort(map,0,N);
        Arrays.sort(list);
        long ans = 0 ;
        for(int i = 0 ; i < N ; i++)
        {
            ans += 1l*map[i]*list[i];
        }
        System.out.println(ans);
    }
}
