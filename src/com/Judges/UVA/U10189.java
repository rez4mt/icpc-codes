package com.Judges.UVA;

import java.util.Scanner;

public class U10189 {
    static int[][] moves = new int[][]{{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int[][] mat ;
        int c = 0;
        while (true)
        {
            c++;


            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && a==b)
                break;
            if(c!=1)
                System.out.println();
            mat = new int[a][b];
            for(int i = 0 ; i < a ; i ++)
            {

                String d = sc.next();
                for(int j = 0 ; j < b ; j++)
                {
                    if(d.substring(j,j+1).equals("*"))
                    {
                        mat[i][j] = -1;
                    }else mat[i][j] = 0;
                }
            }
            check(mat);
            System.out.printf("Field #%d:\n",c);
            print(mat);

        }
    }
    private static void check(int[][] map)
    {
        for(int i = 0;i<map.length;i++)
        {
            for(int j = 0 ; j < map[0].length;j++)
            {
                if(map[i][j] == -1)
                {
                    for (int[] m :
                            moves) {
                        if (i + m[0] < 0 ||
                                j + m[1] < 0 ||
                                i + m[0]>map.length-1 ||
                                j+m[1]>map[0].length-1)
                            continue;
                        if(map[i+m[0]][j+m[1]] == -1)
                            continue;
                        map[i+m[0]][j+m[1]]++;
                    }
                }
            }
        }
    }
    private static void print(int[][] map)
    {
        for(int i = 0 ; i < map.length;i++)
        {
            for(int j = 0 ; j< map[0].length;j++)
            {
                if(map[i][j] == -1)
                    System.out.print("*");
                else System.out.print(map[i][j]);
                //System.out.printf("%2d ",map[i][j]);
            }
            System.out.println();
        }
    }
}
