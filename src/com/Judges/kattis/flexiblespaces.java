package com.Judges.kattis;

import java.util.*;

public class flexiblespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[t+2];
        a[0] = 0;
        a[t+1] = n;
        for (int i = 1; i <= t; i++)
            a[i] = sc.nextInt();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                ts.add(a[j]-a[i]);
            }
        }
        StringBuilder bw = new StringBuilder();
        for (int x:ts) {
            bw.append(x+" ");
        }
        bw.deleteCharAt(bw.length()-1);
        System.out.println(bw);
    }
}
