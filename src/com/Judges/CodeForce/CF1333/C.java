package com.Judges.CodeForce.CF1333;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            list[i] = sc.nextInt();
        }
        HashMap<Integer , TreeSet<Integer>> map = new HashMap<>();
        int [] dp = new int[n];
        dp[0] = list[0];
        for(int i = 1 ; i < n ; i++)
        {
            dp[i] = dp[i-1] + list[i];
            if(!map.containsKey(dp[i]))
                map.put(dp[i] , new TreeSet<>());
            map.get(dp[i]).add(i);
        }

        long all = n*(n+1) / 2;


    }
}
