package com.Judges.CodeForce.CF263;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int x=3,y=3;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = 0 ; j<5;j++)
            {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1)
                {
                    x = i ;
                    y = j;
                }
            }
        }

        System.out.printf("%d",Math.abs(2-x)+Math.abs(2-y));
    }
}
