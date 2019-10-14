package com.Judges.SPOJ;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ABCPATH {
    static char[][] map ;
    static int h , w;
    static long[][] dp;
    static int[] dx , dy ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new char[50][];
        dx = new int[]{-1,-1,-1,0,0,1,1,1};
        dy = new int[]{-1,0,1,-1,1,-1,0,1};
        int t = 1;
        dp = new long[50][50];
        while (true)
        {
            ArrayList<Point> startpoints = new ArrayList<>();
            h = sc.nextInt();
            w = sc.nextInt();
            if(h == 0 && w==0)
                break;
            for(int i = 0 ; i < h ; i++)
            {
                map[i] = sc.next().toCharArray();
                Arrays.fill(dp[i],0,w,-1);
                for(int j = 0 ; j < w ;j++)
                {
                    if(map[i][j] == 'A')
                        startpoints.add(new Point(i,j));

                }
            }

            long max =0;
            for (Point p :
                    startpoints) {
                max = Long.max(check(p.x, p.y),max);
            }
            System.out.printf("Case %d: %d\n", t++,max);
        }
    }
    static long check(int x , int y)
    {
        long res=  1;
        for(int i = 0 ; i < 8 ; i++)
        {
            int nx = x + dx[i] , ny = y + dy[i];
            if(nx <0 || nx >=h || ny<0 || ny>=w)
                continue;
            if(map[x][y]-map[nx][ny] == -1)
            {
                long v;
                if(dp[nx][ny]!=-1)
                    v = dp[nx][ny];
                else
                    v = 1+check(nx,ny);
                dp[nx][ny] = v;
                res = Long.max(res ,v);
            }
        }
        return res;
    }
}
