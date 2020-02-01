package com.Judges;

import com.Judges.uri.*;

import java.util.Arrays;
import java.util.Scanner;


class Main{

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] heights = new int[N];
        for (int i=0; i<N; i++){
            heights[i]= sc.nextInt();
        }
        int[] cost = new int[N];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[0] = 0 ;
        cost[1]= Math.abs(heights[1]-heights[0]);
        for (int i=2; i<N; i++){
            //cost[i] = Math.min(cost[i-1] + Math.abs(heights[i-1]-heights[i]), cost[i-2] + Math.abs(heights[i-2]-heights[i]));
            //int min = Integer.MAX_VALUE;
            for(int j=1; j<=K; j++){

                if (i-j <0)
                    break;
                cost[i]= Math.min(cost[i], cost[i-j]+Math.abs(heights[i]-heights[i-j]));
            }
            //cost[i] = min;
        }
        System.out.println(cost[N-1]);
    }*/
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int list[][] = new int[N][3];
       for (int i=0; i<N; i++){
           list[i][0] = sc.nextInt();
           list[i][1] = sc.nextInt();
           list[i][2] = sc.nextInt();
       }
       int dp[][] = new int[N][3];
       dp[0] = list[0];
       for (int i=1; i<N; i++){
           dp[i][0]=  list[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
           dp[i][1] = list[i][1] + Math.max(dp[i-1][0], dp[i-1][2]);
           dp[i][2] = list[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
       }
       //print(list);
       //print(dp);
       System.out.println(Arrays.stream(dp[N-1]).max().getAsInt());


   }
    private static void print(int[][] map)
    {
        for(int i = 0 ; i < map.length ;i++)
        {
            for(int j = 0 ; j < map[i].length;j++)
                System.out.printf("%3d ",map[i][j]);
            System.out.println();
        }
    }
}