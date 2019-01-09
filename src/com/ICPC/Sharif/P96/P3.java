package com.ICPC.Sharif.P96;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] houses;
        int width ;
        int a,b;
        int ymax=0,xmax=0;
        int[][] ground ;
        int[][] test_area = new int[][]{};
        int dem_count = -1;
        int current_state = 0;
        while (true)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0)
                break;

            houses = new int[a+b][2];
            width = sc.nextInt();
            for(int i = 0 ; i < a+b;i++)
            {
                houses[i] = new int[]{sc.nextInt(),sc.nextInt()};
                ymax = Math.max(ymax,houses[i][1]);
                xmax = Math.max(xmax,houses[i][0]);
            }
            ground = new int[xmax+1][ymax+1];
            for(int i = 0 ; i < houses.length;i++)
            {
                ground[houses[i][0]][houses[i][1]] = 1;
            }
            for(int i = 0 ; i < ground.length-width+1;i++)
            {
                test_area = copy(ground);
                for(int j = i ; j < i+width ; j++)
                {
                    for(int k = 0 ; k < ground[0].length;k++)
                    {

                        test_area[j][k] = 2;
                    }
                }
                if(dem_count == -1)
                    dem_count = count_d_houses(test_area,houses.length);
                else
                    dem_count = Math.min(dem_count,count_d_houses(test_area,houses.length));

            }
            System.out.println(dem_count);

        }
    }
    private static int[][] copy(int[][] src)
    {

        int[][] dest = new int[src.length][src[0].length];
        for(int i = 0 ; i < src.length;i++)
        {
            for(int j = 0 ; j < src[0].length;j++)
                dest[i][j] = src[i][j];
        }
        return dest;
    }
    private static int count_d_houses(int[][] g,int org_count)
    {
        int s = 0;
        for(int i = 0 ; i < g.length;i++)
        {
            for(int j = 0 ; j< g[0].length;j++)
            {
                if(g[i][j] == 1)
                    s++;
            }
        }
        return org_count - s;
    }
    private static void printGround(int[][] a)
    {
        for(int i = 0 ; i < a.length;i++)
        {
            for(int j = 0 ; j < a[i].length;j++)
            {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
    }
}


