package com.Judges.uri;

import java.util.Scanner;

public class P1478 {
    public static void main(String[] args) {
        new P1478();
    }
    public P1478()
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
                    mat[i][j] = num;
                    mat[j][i] = num;
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
                        System.out.printf("%3d",mat[i][j]);
                    else
                        System.out.printf(" %3d",mat[i][j]);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }while (true);
    }
}
