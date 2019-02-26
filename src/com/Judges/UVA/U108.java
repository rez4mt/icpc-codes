package com.Judges.UVA;

import java.util.Scanner;

public class U108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[][] nums = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    nums[i][j] =  (sc.nextInt());
                }
            }

            int[][] pre = new int[N][N];
            pre[0][0] = nums[0][0];
            int max = pre[0][0];
            int x = 0,y = 0;
            for (int i = 1; i < N; i++)
            {
                pre[0][i] = pre[0][i-1] + nums[0][i];
                pre[i][0] = pre[i-1][0] + nums[i][0];
            }
            for(int i = 1 ; i < N ; i++) {
                for (int j = 1; j < N; j++)
                {
                    pre[i][j] = ( pre[i][j-1] + pre[i-1][j] ) - pre[i-1][j-1] + nums[i][j];
                }
            }
            int sum = Integer.MIN_VALUE;
            print(pre);
            for(int i = 0 ; i < N;i++)
            {
                for(int j = 0 ; j < N ; j++)
                {
                    for(int cx = i; cx < N ; cx++)
                    {
                        for(int cy = j ; cy < N ;cy++)
                        {
                            if( i == 0 && j == 0)
                            {
                                sum = pre[i][j];
                            }else if( i == 0)
                            {
                                sum = pre[cx][cy] - pre[cx][j-1];
                            }else if( j == 0)
                            {
                                sum = pre[cx][cy] - pre[i-1][cy];
                            }else
                            {
                                sum = pre[cx][cy] - (pre[i-1][cy]+pre[cx][j-1]) + pre[i-1][j-1];
                            }
                            max = Math.max(max,sum);
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static void print(int[][] aa)
    {
        for(int i = 0 ; i < aa.length;i++)
        {
            for(int j = 0 ; j < aa.length ; j++)
                System.out.printf("%-3s",aa[i][j] + " ");
            System.out.println();
        }
    }
}
