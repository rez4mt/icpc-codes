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
                if(nums[0][i] > max)
                {
                    max = nums[0][i];
                    x = 0;
                    y = i;
                }else if(nums[i][0] > max)
                {
                    max = nums[i][0];
                    x = i ;
                    y = 0;
                }else if(pre[0][i] > max)
                {
                    max = pre[0][i];
                    x = 0;
                    y = i;
                }else if(pre[i][0] > max)
                {
                    x = i;
                    y = 0;
                    max = pre[i][0];
                }

            }
            for(int i = 1 ; i < N ; i++) {
                for (int j = 1; j < N; j++)
                {
                    pre[i][j] = ( pre[i][j-1] + pre[i-1][j] ) - pre[i-1][j-1] + nums[i][j];
                    if(max < pre[i][j])
                    {
                        x = i;
                        y = j;
                        max = pre[i][j];
                    }
                }
            }


            int sum = Integer.MIN_VALUE;
            int tox = -1,toy = -1;
            if(x == 0 && y == 0)
            {
                System.out.println(nums[0][0]);
                continue;
            }else if (x == 0 && y!=0)
            {
                max = pre[x][y] - pre[x][y-1];
            }else if( x!=0 && y == 0)
            {
                max = pre[x][y] - pre[x-1][y];
            }else
            {
                max = pre[x][y] - pre[x-1][y] - pre[x][y-1] + pre[x-1][y-1];
            }
            for(int i = x ; i>=0 ; i--)
            {
                for(int j = y ; j>=0 ; j--)
                {
                    if(i == 0 && j == 0)
                    {
                        sum = pre[i][j];
                    }else if (i == 0 && j!=0)
                    {
                        sum = pre[i][j] - pre[i][j-1];
                    }else if( i!=0 && j == 0)
                    {
                        sum = pre[i][j] - pre[i-1][j];
                    }else
                    {
                        sum = pre[i][j] - pre[i-1][j] - pre[i][j-1] + pre[i-1][j-1];
                    }
                    max = Math.max(max,sum);
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
                System.out.print(aa[i][j] + " ");
            System.out.println();
        }
    }
}
