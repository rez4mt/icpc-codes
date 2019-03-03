package com.practice;

import java.util.Scanner;

public class lcsDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s , d;
        s = sc.nextLine();
        d = sc.nextLine();
        int[][] lcs = new int[s.length()+1][d.length()+1];
        for(int i = 1 ; i <= s.length();i++)
        {
            for(int j = 1;j<=d.length();j++)
            {
                if(s.charAt(i-1) == d.charAt(j-1))
                {
                    lcs[i][j] = lcs[i-1][j-1]+1;
                }else
                {
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        System.out.println(lcs[s.length()][d.length()]);

    }
}
