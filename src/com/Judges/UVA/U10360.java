package com.Judges.UVA;


import java.util.Scanner;

public class U10360 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int D = sc.nextInt();
            int[][] mat = new int[1025][1025];
            int N = sc.nextInt();
            for(int i = 0 ; i < N ; i++ )
            {
                int xi = sc.nextInt();
                int yi = sc.nextInt();
                int pi = sc.nextInt();
                for(int x = -D ; x<=D ; x++)
                {
                    for(int y = -D ; y <=D ; y++)
                    {
                        int xx = xi+x;
                        int yy = yi+y;
                        if(valid(xx,yy))
                        {
                            mat[xx][yy] += pi;
                        }
                    }
                }
            }
            int max = 0;
            int mX = 0 ;
            int mY = 0;

            for(int i = 0 ; i < 1025 ; i++)
            {
                for(int j = 0 ; j < 1025 ; j++)
                {
                    if(mat[i][j]>max)
                    {
                        max = mat[i][j];
                        mX = i ;
                        mY = j;
                    }
                }
            }
            System.out.println(mX + " " + mY + " " + max);
        }
    }
    static boolean valid(int x, int y)
    {
        return x >= 0 && y >= 0 && x <= 1024 && y <= 1024;
    }
}
