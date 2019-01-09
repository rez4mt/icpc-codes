package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U466 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        ml:
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            char[][][] mat = new char[2][n][n];
            char[][] rotated = new char[n][n];

            for(int i = 0 ; i < n ; i++)
            {

                mat[0][i] = sc.next().toCharArray();
                mat[1][i] = sc.next().toCharArray();
                rotated[i] = mat[0][i].clone();
            }
            if(Arrays.deepEquals(mat[0],mat[1]))
            {
                System.out.printf("Pattern %d was preserved.\n",tc++);
                continue;
            }
            for(int i = 0 ; i < 3 ; i ++)
            {
                rotated = rotate(rotated);
                if(Arrays.deepEquals(rotated,mat[1]))
                {
                    System.out.printf("Pattern %d was rotated %d degrees.\n",tc++,(i*90)+90);
                    continue ml;
                }
            }
            rotated = reflect(mat[0]);
            if(Arrays.deepEquals(rotated,mat[1]))
            {
                System.out.printf("Pattern %d was reflected vertically.\n",tc++);
                continue;
            }
            for(int i = 0 ; i < 3 ; i ++)
            {
                rotated = rotate(rotated);
                if(Arrays.deepEquals(rotated,mat[1]))
                {
                    System.out.printf("Pattern %d was reflected vertically and rotated %d degrees.\n",tc++,(i*90)+90);
                    continue ml;
                }
            }
            System.out.printf("Pattern %d was improperly transformed.\n",tc++);
        }
    }
    private static char[][] rotate(char[][] src)
    {
        char[][] dest = new char[src.length][src.length];
        int n = src.length;
        for(int i = 0 ; i < src.length; i ++)
        {
            for(int j = 0 ; j< src.length;j++)
                dest[i][j] = src[n - 1 - j][i];

        }
        return dest;
    }
    private static char[][] reflect(char[][] src)
    {
        char[][] dest = new char[src.length][src.length];
        int n = src.length;
        for(int i = 0; i < n ; i ++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                dest[i][j] = src[n - 1 - i ][j];
            }
        }
        return dest;
    }
    private static void print(char[][] data)
    {
        for(int i = 0 ; i< data.length;i++)
        {
            for(int j = 0 ; j < data[0].length ; j ++)
            {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
