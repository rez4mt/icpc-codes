package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class U784 {
    static int[][] grid;
    static int[][] moves = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        while (T-->0)
        {
            grid = new int[30][80];
            for(int i = 0 ; i < 30;i++)
            {
                Arrays.fill(grid[i] , -1);
            }
            int startI=0,startJ=0,x = 0;
            String data;
            while ((data = br.readLine())!= null)
            {
                if(data.charAt(0) == '_')
                    break;

                for(int i = 0 ; i < data.length() ; i++)
                {
                    if(data.charAt(i) == '*')
                    {
                        startJ = i;
                        startI = x;
                    }else if(data.charAt(i) == 'X')
                    {
                        grid[x][i] = 'X';
                    }else grid[x][i] = ' ';
                }
                x++;
            }
            check(startI,startJ);
            for(int i = 0 ; i < x; i++)
            {
                int j = 0;
                while (grid[i][j]!=-1)
                {
                    out.print((char) grid[i][j++]);
                }
                out.println();
            }
            out.println(data);
        }
        out.flush();
    }
    public static void check(int i , int j)
    {

        grid[i][j] = '#';
        for (int[] m:
                moves) {
            if(grid[i+m[0]][j+m[1]]==' ')
                check(i+m[0],j+m[1]);
        }
    }
}
