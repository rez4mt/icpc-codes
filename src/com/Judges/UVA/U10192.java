package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Scanner;

public class U10192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] LCS ;
        int T = 1;
        while (true)
        {

            String l = sc.nextLine();
            if(l.equals("#"))
                break;
            String l2 = sc.nextLine();
            LCS = new int[l.length()+1][l2.length()+1];
            for(int i = 1;i <= l.length();i++)
            {
                for(int j =1 ;j <=l2.length();j++)
                {
                    if(l.charAt(i-1) == l2.charAt(j-1))
                    {
                        LCS[i][j] = LCS[i-1][j-1]+1;
                    }else {
                        LCS[i][j] = LCS[i-1][j]>LCS[i][j-1]?
                                LCS[i-1][j] : LCS [i][j-1];
                    }
                }
            }

            System.out.printf("Case #%d: you can visit at most %d cities.\n",T++,LCS[l.length()][l2.length()]);
        }

    }
    private static void print(int[][] p)
    {
        for(int i = 0 ; i < p.length;i++)
        {
            for(int j = 0 ; j < p[0].length;j++)
            {
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }

    }
}
