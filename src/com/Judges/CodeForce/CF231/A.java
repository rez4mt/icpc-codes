package com.Judges.CodeForce.CF231;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] list = new int[N][3];
        for(int i = 0 ; i < N ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
                list[i][j] = sc.nextInt();
        }
        int max = 0 ;
        for(int i = 0 ; i < N ; i++)
        {
            int count = 0;
            for(int j = 0 ; j < 3  && count < 2;j++)
            {
                count+=list[i][j];
            }
            if(count >=2)
                max++;
        }
        System.out.println(max);
    }
}
