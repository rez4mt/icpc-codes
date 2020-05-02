package com.Judges.CodeForce.CF1323;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] ns = new int[n];
        for(int i = 0 ; i < n ; i++)
            ns[i] = sc.nextInt();
        int[] ms = new int[m];
        for(int i = 0 ; i < m ; i++)
            ms[i] = sc.nextInt();
        int[] prefN = new int[n+1];
        prefN[0] = ns[0];
        for(int i = 1; i < n ; i++)
            prefN[i] = prefN[i-1] + ns[i];
        int[] prefM = new int[m+1];
        prefM[0] = ms[0];
        for(int i = 1; i < m ; i++)
            prefM[i] = prefM[i-1] + ms[i];

        
    }
}
