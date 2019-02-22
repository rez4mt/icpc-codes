package com.Judges.UVA;

import java.util.HashMap;
import java.util.Scanner;

public class U10074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m == 0 && n == 0)
                return;

            int[][] mat = new int[m][n];

            for(int i = 0 ; i < m ; i++)
                for(int j = 0 ; j < n ; j++)
                    mat[i][j] = sc.nextInt();
                //

            int[][] pre = new int[m][n];

            pre[0][0] = mat[0][0] == 1?0:1;

            int max = 0;

            for(int i = 0 ; i < n ;i++)
                pre[0][i] = 1 - mat[0][i];
            int count = 0;
            int sum = 0;
            HashMap<Integer,Integer> val = new HashMap<>();
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    pre[i][j] =mat[i][j]==1? 0 :pre[i-1][j] + 1;
                    if(pre[i][j] == 0)
                    {
                        count = 0;
                        sum = 0;
                    }else{
                        count++;
                        sum+=pre[i][j];
                        max = Math.max((int) ( (sum / count)) * count,max);
                    }

                }
            }
            System.out.println(max);


        }
    }

    static void print(int[][] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%-3d ",a[i][j]);
            }
            System.out.println();
        }
    }
}
