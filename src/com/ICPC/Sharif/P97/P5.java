package com.ICPC.Sharif.P97;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0 ; i < n;i++)
        {
            for(int j = 0 ; j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0 ; i < n;i++)
        {
            for(int j = 0 ; j<n;j++)
            {
                count+=checkPos(mat,i,j);
            }
        }
        System.out.println(count);
    }
    static int checkPos(int[][] m , int i,int j)
    {
        int to_ret = 0;
        int[][] moves = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
        for (int[] move :
                moves) {
            if(move[0]+i<0 || move[0]+i>=m.length)
                continue;
            if(move[1]+j<0 || move[1]+j>=m.length)
                continue;
            if(m[i+move[0]][j+move[1]] >= m[i][j])
            {
                return 0;
            }
        }
        return 1;
    }
    static void printMap(int[][] m)
    {
        for(int i = 0 ; i < m.length;i++)
        {
            for(int j = 0 ; j<m.length;j++)
            {
                System.out.printf("%d ",m[i][j]);
            }
            System.out.println();
        }
    }
}
