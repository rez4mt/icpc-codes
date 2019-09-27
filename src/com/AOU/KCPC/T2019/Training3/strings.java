//package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class strings {
    static String X;
    static String Y;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("strings.in"));
        int T = sc.nextInt();
        while (T-->0)
        {

            char[] list = sc.next().toCharArray() ,list2 = sc.next().toCharArray();
            int aa = lcs(list , list2 , list.length ,list2.length);
            System.out.println(list.length + list2.length - (2*aa));
        }
    }

    static int lcs( char[] X, char[] Y, int m, int n )
    {
        int L[][] = new int[m+1][n+1];

    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
        }
        return L[m][n];
    }

    /* Utility function to get max of 2 integers */
    static int max(int a, int b)
    {
        return (a > b)? a : b;
    }
}
