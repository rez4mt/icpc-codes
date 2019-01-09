package com.ICPC.Sharif.P89;

import java.util.Arrays;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        int[][] steps = new int[][]{{1,1},{1,-1},{1,1},{-1,1}};
        Object[][] mat;
        int[][] pos ;
        Scanner sc = new Scanner(System.in);

        mat = new Object[20][20];

        int cx=0,cy=0;
        for(int i = 0 ; i < mat.length;i++)
        {
            mat[cx][cy] = i+"";
            cx += steps[i%4][0];
            cy += steps[i%4][1];
        }

    }

    private static void printGround(Object[][] a)
    {

        for(int i = 0 ; i < a.length;i++)
        {
            for(int j = 0 ; j < a[i].length;j++)
            {
                System.out.printf("%2s ",a[i][j]);
            }
            System.out.println();
        }
    }
    static Object[][] rotate(Object [][] mat) {

        int n = mat.length;
        int m = mat.length;
        Object[][] output = new Object[m][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) {
                output[j][n - 1 - i] = mat[i][j];
            }
        }

        return output;
    }
    private static void fill(Object[][] a,Object n)
    {
        for(int i = 0 ; i < a.length;i++)
            Arrays.fill(a[i],n);
    }
}
