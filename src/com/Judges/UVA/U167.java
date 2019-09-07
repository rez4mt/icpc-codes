package com.Judges.UVA;

import java.util.Scanner;

public class U167 {
    static boolean[] takenY ;
    static int[][] chess ;
    static long max = (int) 10e-9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        takenY = new boolean[8];
        chess = new int[8][8];
        while (T-->0)
        {
            for(int i = 0 ; i < 8 ; i++)
            {
                takenY[i] = false;
                for(int j = 0 ; j < 8 ; j++)
                    chess[i][j] = sc.nextInt();
            }
            System.out.printf("%5d\n",dfs(0,0));
        }
    }
    private static int dfs(int x,int val)
    {
        if(x == 8)
        {
            //placed 8;
            return val;
        }
        int mx = 0 ;
        for(int j = 0 ; j < 8 ; j++)
        {
            if(!takenY[j]){
                takenY[j] = true;
                mx = Math.max(mx , dfs(x+1,val+chess[x][j]));
                takenY[j] = false;
            }
        }
        return mx;
    }
}
