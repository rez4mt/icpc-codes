package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U11094 {
    static char curr ;
    static boolean[][] visited ;
    static char[][] map;
    static int A,B;
    static long count;
    static long MAX = 0;
    static int[][] moves = {{0,-1},{0,1},{-1,0},{1,0}};
    public static void main(String[] args) throws IOException {
        Scanner fr = new Scanner(System.in);
        while (fr.hasNext())
        {
            MAX = 0;
            A = fr.nextInt();
            B = fr.nextInt();
            map = new char[A][B];
            fr.nextLine();
            for(int i = 0 ; i < A ; i++)
            {
                String d = fr.nextLine();
                for(int j = 0 ; j < B ; j++)
                {
                    map[i][j] = d.charAt(j);
                }
            }
            visited = new boolean[A][B];

            int x = fr.nextInt();
            int y = fr.nextInt();

            count = 0;

            curr = map[x][y];
            count = 0;

            for(int i = 0 ; i < A ; i++)
            {
                for(int j = 0 ; j < B ;j++)
                {
                    if( visited[i][j] || map[i][j] != curr)
                        continue;

                    dfs(i,j);
                    MAX = Math.max(MAX,count);
                    count = 0;
                }
            }
            System.out.println(MAX);
        }
    }
    private static void dfs(int i,int j)
    {
        visited[i][j] = true;
        count++;
        for (int[] m :
                moves) {
            if( valid(i+m[0],j+m[1])  && !visited[i+m[0]][j+m[1]] && map[i+m[0]][j+m[1]] == map[i][j])
            {
                dfs(i+m[0],j+m[1]);
            }
        }
    }
    private static boolean valid(int i,int j)
    {
        return (i>=0 && j>=0 && i<A && j<B);
    }

}
