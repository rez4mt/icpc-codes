package com.Judges.CodeForce.CF1360;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] row = new int[n];
            int[] cols = new int[m];
            int[][] map = new int[n][m];
            boolean flag = true;
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j< m ; j++)
                {
                    if(row[i]<a && cols[j]<b)
                    {
                        map[i][j] = 1;
                        row[i]++;
                        cols[j]++;
                    }
                }
                if(row[i]!=a)
                {
                    flag = false;
                    break;
                }
            }
            for(int i = 0 ; i< m ;i++)
                if(cols[i]!=b)
                    flag = false;

            if(!flag){
                System.out.println("No");
                continue;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("YES\n");
            for(int i = 0 ; i < n ;i++)
            {
                for(int j = 0 ; j < m;j++)
                    sb.append(map[i][j]);
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}
