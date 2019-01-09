package com.Judges.CodeForce.CF337;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[m];
        for(int i = 0 ; i < m ;i ++)
            list[i] = sc.nextInt();
        Arrays.sort(list);
        int least = list[n-1] - list[0];
        for(int i = 1 ; i <= m - n ; i++)
        {
            if(least > list[n-1+i]-list[i])
                least = list[n-1+i]-list[i];
        }
        System.out.println(least);

    }
}
