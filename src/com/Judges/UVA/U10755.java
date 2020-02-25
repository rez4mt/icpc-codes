package com.Judges.UVA;

import java.util.*;

public class U10755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[][][] list = new int[a][b][c];
            for(int i = 0 ; i < a ; i++)
            {
                for(int j = 0 ; j < b ;j++)
                {
                    for(int k = 0 ; k < c ; k++)
                        list[i][j][k] = sc.nextInt();
                }
            }
            long[][][] dp = new long[a][b][c];

        }
    }
}
