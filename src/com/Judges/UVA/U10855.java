package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U10855 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,n;
        String[][] lMat ;
        String[][][] sMat;
        int[] ans ;
        while (true)
        {
            N = sc.nextInt();
            n = sc.nextInt();
            if(N == 0 && n == 0)
                break;
            ans = new int[4];
            lMat = new String[N][N];
            sMat = new String[4][n][n];
            for(int i = 0;i<N;i++)
            {
                String d = sc.next();
                for(int j = 0;j<N;j++)
                {
                    lMat[i][j] = d.substring(j,j+1);
                }
            }
            for(int i = 0;i<n;i++)
            {
                String d = sc.next();
                for(int j = 0;j<n;j++)
                {
                    sMat[0][i][j] = d.substring(j,j+1);
                }
            }
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j<n;j++)
                {
                    sMat[1][i][j] = sMat[0][n-1-j][i];      //90
                    sMat[2][i][j] = sMat[0][n-1-i][n-1-j];  //180
                    sMat[3][i][j] = sMat[0][j][n-1-i];      //270
                }
            }

            for(int i = 0; i < N - n + 1; i++) {
                for(int j = 0; j < N - n + 1; j++) {
                    for(int k = 0; k < 4; k++) {
                        if(check(i,j,k,n,sMat,lMat))
                            ans[k]++;
                    }
                }
            }
            System.out.printf("%d %d %d %d\n",ans[0],ans[1],ans[2],ans[3]);
        }
    }
    private static boolean check(int r,int c,int b,int n,String[][][] small,String[][] big)
    {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(!big[r + i][c + j].equals(small[b][i][j]))
                    return false;
        return true;
    }
    private static void print(String[][] d)
    {
        for(int i=0;i < d.length;i++)
        {
            for(int j = 0 ;j < d.length;j++)
            {
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }
}
