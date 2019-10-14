package com.Judges.CodeForce.CF1228;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        //hs
        //ws
        st = new StringTokenizer(br.readLine());
        boolean[][] matrix = new boolean[h][w];
        for(int i = 0 ; i < h ; i++)
        {
            int current = Integer.valueOf(st.nextToken());
            for(int j = 0 ; j < current ; j++)
                matrix[i][j] = true;
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < w ; i++)
        {
            int current = Integer.valueOf(st.nextToken());
            for(int j = 0 ; j < current ; j++)
                matrix[j][i] = true;
        }
        print(matrix);
    }
    public static void print(boolean[][] d)
    {
        for(int i = 0 ; i < d.length ; i++)
        {
            for(int j = 0 ; j < d[0].length;j++)
                System.out.printf("%s ",!d[i][j]?"0":"1");
            System.out.println();
        }
    }
}
