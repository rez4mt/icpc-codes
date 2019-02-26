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

            pre[0][0] =  1 - mat[0][0];
            int max = 0;
            for(int i = 1 ; i < n ;i++)
            {
                pre[0][i] = pre[0][i-1] + (1 - mat[0][i]);
            }
            for(int i = 1 ; i < m ;i++)
            {
                pre[i][0] = pre[i-1][0]  + (1 - mat[i][0]);
            }
            HashMap<Integer,Integer> val = new HashMap<>();
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    pre[i][j] = (pre[i][j-1]+ pre[i-1][j]) - pre[i-1][j-1] + (1-mat[i][j]);
                }
            }
            int sum = 0;
            for(int i = 0 ; i < m ; i++)
            {
                for(int j = 0 ; j < n ; j++)
                {
                    if(mat[i][j] == 1)
                        continue;
                    checloop:
                    for(int cx = i ; cx < m ;cx++)
                    {
                        for(int cy = j; cy < n ; cy++)
                        {
                            if(mat[cx][cy] == 1)
                                continue checloop;
                            if(i == 0 && j == 0)
                            {
                                sum = pre[cx][cy];
                            }else if(i == 0 )
                            {
                                sum = pre[cx][cy] - pre[cx][j-1];
                            }else if(j == 0 )
                            {
                                sum = pre[cx][cy] - pre[i-1][cy];
                            }else
                            {
                                sum = pre[cx][cy] - (pre[i-1][cy]+pre[cx][j-1]) + pre[i-1][j-1];
                            }

                            int s2 = (cx-i) + 1;
                            int s3 = (cy-j) + 1;
                            if(sum != s2*s3)
                                continue  checloop;
                            max = Math.max(max,sum);
                        }
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
