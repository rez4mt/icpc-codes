package com.Judges.uri;

import java.util.Scanner;

public class P1827 {
    public static void main(String[] args) {
        new P1827();
    }

    /*public P1827()
    {
        Scanner sc  = new Scanner(System.in);
        int[][] mat ;
        int uri ;
        while (sc.hasNext())
        {
            int l = sc.nextInt();
            mat = new int[l][l];
            uri = (l/2)-1;
            for(int i = 0 ; i < l ; i++)
            {
                for(int j = 0 ; j < l ; j++)
                {
                    if( i == j || i+j == l-1)
                    {

                        if( i < uri )
                        {
                            if(j < uri)
                                mat[i][j] =2;
                            else if( l-j <= uri )
                                mat[i][j] = 3;
                        }else if(l-i <= uri)
                        {
                            if(j < uri)
                                mat[i][j] = 3;
                            else if( l-j <= uri )
                                mat[i][j] = 2;
                        }
                    }
                    if(i >= uri && j>=uri && j<l-uri && i<l-uri)
                    {
                        mat[i][j] = 1;
                    }
                }
            }
            mat[uri+1][uri+1] = 4;
            for(int i = 0 ; i < l ; i++)
            {
                for(int j = 0 ; j < l ; j++)
                {
                    System.out.printf("%d ",mat[i][j]);
                }
                System.out.println();
            }
            System.out.println();

        }


    }*/
    public P1827()
    {
        Scanner sc = new Scanner(System.in);
        int[][] mat ;
        int l ,n;
        while (sc.hasNext())
        {
            l = sc.nextInt();
            mat = new int[l][l];
            for(int i = 0 , j = 0;i<l;i++,j++)
            {
                mat[i][j] = 2;
            }
            for(int i = 0 , j = l-1;i<l;i++,j--)
            {
                mat[i][j] = 3;
            }
            n = (l/3);
            for(int i = n;i<l-n;i++)
            {
                for(int j = n;j<l-n;j++)
                {
                    mat[i][j] = 1;
                }
            }
            mat[l/2][l/2] = 4;
            for (int i = 0 ; i < l ; i++)
            {
                for (int j = 0 ; j < l ; j++)
                {
                    System.out.printf("%d",mat[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
