package com.Judges.UVA;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class U167 {
    static boolean[] takenY ;
    static int[][] chess ;
    static int[] pos ;
    static long max = (int) 10e-9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        takenY = new boolean[8];
        chess = new int[8][8];
        pos = new int[8];
        Arrays.fill(pos , -1);
        while (T-->0)
        {
            for(int i = 0 ; i < 8 ; i++)
            {
                takenY[i] = false;
                for(int j = 0 ; j < 8 ; j++)
                    chess[i][j] = sc.nextInt();
            }
            System.out.printf("%5d\n",dfs(0,0));
            System.out.println(t);
        }
    }
    static int t = 0 ;
    private static int dfs(int x,int val)
    {
        if(x == 8)
        {
            //placed 8;
            t++;
            return val;
        }
        int mx = 0 ;
        for(int j = 0 ; j < 8 ; j++)
        {
            if(check(x , j)){
                pos[x] = j;
                int v = dfs(x+1,val+chess[x][j]);
                pos[x] = -1;
                mx = Integer.max(v , mx);
            }
        }
        return mx;
    }
    private static boolean check(int x , int target)
    {
        for(int i = 0 ; i < x ; i++)
        {
            if(pos[i] == -1)
                continue;
            if(pos[i] == target)
                return false;
            if(Math.abs(pos[i] - target)==Math.abs(x-i))
                return false;
        }
        return true;
    }

}
