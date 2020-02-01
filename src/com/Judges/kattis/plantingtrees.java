package com.Judges.kattis;

import java.util.*;

public class plantingtrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int max = a[a.length-1] + 2;
        for (int i = a.length-2; i >= 0; i--) {
            if (a[i] + a.length-1-i + 2 > max) {
                max = a[i] + a.length-1-i + 2;
            }
        }
        System.out.println(max);
    }
}
