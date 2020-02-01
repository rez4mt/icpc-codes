package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U855 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int A = sc.nextInt();
            int s = sc.nextInt();
            int F = sc.nextInt();
            int[] as = new int[F];
            int[] ss = new int[F];
            for(int i = 0 ; i < F ; i++)
            {
                as[i] = sc.nextInt();
                ss[i] = sc.nextInt();
            }
            Arrays.sort(as);
            Arrays.sort(ss);
            System.out.printf("(Street: %d, Avenue: %d)\n" , as[(F-1)/2],ss[(F-1)/2]);
        }
    }
}
