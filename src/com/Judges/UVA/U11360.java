package com.Judges.UVA;

import java.util.Scanner;

public class U11360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(),op,s;
        int[][] mat;
        int t = 0;
        while(T-->0)
        {
            t++;
            s = sc.nextInt();
            mat = new int[s][s];
            readTo(mat,sc);
            op = sc.nextInt();
            while (op-->0)
            {
                switch (sc.next())
                {
                    case "row":
                        row(mat,sc.nextInt(),sc.nextInt());
                        break;
                    case "col":
                        col(mat,sc.nextInt(),sc.nextInt());
                        break;
                    case "inc":
                        inc(mat);
                        break;
                    case "dec":
                        dec(mat);
                        break;
                    case "transpose":
                        mat = transpose(mat);
                        break;
                }
            }
            System.out.printf("Case #%d\n",t);
            print(mat);
            System.out.println();
        }
    }
    private static void col(int[][] mat,int a,int b)
    {
        a--;
        b--;
        int[] temp = new int[mat.length];
        for(int i = 0 ; i < mat.length;i++)
        {
            temp[i] = mat[i][a];
            mat[i][a] = mat[i][b];
            mat[i][b] = temp[i];
        }

    }
    private static void print(int[][] mat)
    {
        for(int i = 0 ; i < mat.length; i ++)
        {
            for(int j = 0 ; j < mat.length;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    private static void readTo(int[][] mat, Scanner sc )
    {
        int size = mat.length;
        for(int i = 0; i < size;i++)
        {
            String s = sc.next();
            for(int j = 0 ; j < size;j++)
            {
                mat[i][j] = Integer.valueOf(s.substring(j,j+1));
            }
        }
    }

    private static int[][] transpose(int[][] mat)
    {
        int[][] newmat = new int[mat.length][mat.length];
        for(int i = 0 ; i < mat.length;i++)
        {
            for(int j = 0 ; j < mat.length; j ++)
            {
                newmat[j][i] = mat[i][j];
            }
        }
        return newmat;
    }
    private static int[][] row(int[][] mat,int a,int b)
    {
        a--;
        b--;
        int[] ra = mat[a];
        int[] rb = mat[b];
        mat[a] = rb;
        mat[b] = ra;
        return mat;
    }

    private static void inc(int[][] mat)
    {
        for(int i = 0 ; i < mat.length;i++)
        {
            for(int j = 0 ; j < mat.length; j++)
            {
                mat[i][j]++;
                if(mat[i][j]<0)
                    mat[i][j] = mat[i][j] + 10;
                else if(mat[i][j]>9)
                {
                    mat[i][j] = mat[i][j] - 10;
                }
            }
        }
    }
    private static void dec(int[][] mat)
    {
        for(int i = 0 ; i < mat.length;i++)
        {
            for(int j = 0 ; j < mat.length; j++)
            {
                mat[i][j]--;
                if(mat[i][j]<0)
                    mat[i][j] = mat[i][j] + 10;
                else if(mat[i][j]>9)
                {
                    mat[i][j] = mat[i][j] - 10;
                }
            }
        }
    }
}
