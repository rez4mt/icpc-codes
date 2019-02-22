package com.Judges.uri;

import java.util.Scanner;

public class P1393 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            int[] counts = new int[N+1];
            counts[N] = 1;
            counts[N-1] = 1;
            for(int k = N -2; k>= 0;k--)
                counts[k] = counts[k+1] + counts[k+2];

            System.out.println(counts[0]);
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 41;
        int[] steps = new int[MAX];

        steps[0] = 1;
        steps[1] = 1;
        for(int i = 2; i < MAX ; i++)
            steps[i] = steps[i-1]+steps[i-2];
        while (true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            System.out.println(steps[N]);
        }
    }
}
