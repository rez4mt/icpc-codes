package com.Judges.uri;

import java.util.Scanner;

public class P1173 {
    public P1173()
    {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        System.out.printf("N[0] = %d\n",arr[0]);
        for(int i = 1 ; i<10;i++)
        {
            arr[i] = arr[i-1]*2;
            System.out.printf("N[%d] = %d\n",i,arr[i]);
        }

    }

    public static void main(String[] args) {
        new P1173();
    }
}
