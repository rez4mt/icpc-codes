package com.Judges.uri;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P1308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            long N = sc.nextLong();
            // (x(x-1))/2 == N -> sum of line
            long delta = 1 + 8*N;
            System.out.println((long)((-1 + Math.sqrt(delta))/2));
        }
    }
}
