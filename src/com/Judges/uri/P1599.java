package com.Judges.uri;

import java.util.HashMap;
import java.util.Scanner;

public class P1599 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat;
        int[][] mov = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

        while (sc.hasNext())
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            mat = new int[n][m];

            for(int i = 0 ; i < n ; i ++)
            {
                for(int j = 0 ; j < m  ; j ++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }
            boolean hasPeak = false;
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j < m ; j++)
                {
                    boolean isPeak = true;
                    for(int[] mo : mov)
                    {
                        //check all moves;
                        if(i + mo[0] >=0 && i + mo[0]<n && j + mo[1]>=0 && j+mo[1]<m)
                        {
                            if(mat[i][j]<=mat[i+mo[0]][j+mo[1]])
                                isPeak = false;
                        }
                    }
                    if(isPeak)
                    {
                        hasPeak = true;
                        System.out.printf("%d %d\n",i+1,j+1);
                    }
                }
            }
            if(!hasPeak)
                System.out.println(-1);
            System.out.println();

        }
    }
}
