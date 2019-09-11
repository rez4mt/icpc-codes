package com.Judges.UVA;

import java.util.Scanner;

public class U11520 {
    static int[][] moves = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1 ; tc <= T ; tc++)
        {
            int N = sc.nextInt();
            char[][] map = new char[N][];
            for(int i = 0 ; i < N ;i++)
                map[i] = sc.next().toCharArray();
            for(int i = 0 ; i < N ; i++)
            {
                for(int j = 0 ; j < N ; j++)
                {
                    if(map[i][j] == '.')
                    {
                        for(char ch = 'A' ; ch < 'Z' ; ch++)
                        {
                            if(ok(ch , map , i , j))
                            {
                                map[i][j] = ch;
                                break;
                            }
                        }
                    }
                }

            }
            StringBuilder b = new StringBuilder();
            for(int l = 0; l < N; ++l)
                b.append(map[l]).append("\n");
            System.out.printf("Case %d:\n%s", tc, b.toString());

        }
    }
    static boolean ok(char ch , char[][] map , int i , int j)
    {
        for(int[] m : moves)
        {
            if(i+m[0] >= 0 && i+m[0]<map.length && j+m[1] >=0 && j+m[1]<map.length)
            {
                if(map[i+m[0]][j+m[1]] == ch)
                    return false;
            }
        }
        return true;
    }
}
