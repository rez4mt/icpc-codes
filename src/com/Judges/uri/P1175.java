package com.Judges.uri;

import java.util.Scanner;

public class P1175 {
    public P1175()
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        for(int i = 0 ; i< 20 ; i ++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 19,j=0;i>=0;i--,j++)
        {
            System.out.printf("N[%d] = %d\n",j,arr[i]);
        }

    }

    public static void main(String[] args) {
        new P1175();
    }
}
