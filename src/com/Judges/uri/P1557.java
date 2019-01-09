package com.Judges.uri;

import java.util.Scanner;

public class P1557 {
    public static void main(String[] args) {
        new P1557();
    }
    public P1557()
    {
        Scanner sc = new Scanner(System.in);
        int s,num,l;
        int[][] mat ;
        do{
            s = sc.nextInt();
            if(s == 0)
                break;
            mat = new int[s][s];
            num = 0;
            l = 0;
            for(int i = 0 ; i < s ; i++)
            {
                num = 0;
                for(int j = 0 ; j < s ; j++)
                {
                    if (j<l)
                        continue;
                    num++;
                    mat[i][j] = (int) Math.pow(2,j+l);
                    mat[j][i] = (int) Math.pow(2,j+l);
                    if(num ==s)
                        num = 0;
                }
                l++;
            }

            for (int i = 0 ; i < s ; i++)
            {
                for(int j = 0 ; j < s ; j ++)
                {
                    if ( j == 0)
                        System.out.printf("%"+String.valueOf(mat[s-1][s-1]).length()+"d",mat[i][j]);
                    else
                        System.out.printf(" %"+String.valueOf(mat[s-1][s-1]).length()+"d",mat[i][j]);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }while (true);
    }
}
