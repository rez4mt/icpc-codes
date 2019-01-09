package com.Judges.uri;

import java.util.Scanner;

public class P1172 {
    public P1172()
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0 ; i < 10 ; i ++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]<1)
                arr[i] = 1;
            System.out.printf("X[%d] = %d\n",i,arr[i]);
        }
    }

    public static void main(String[] args) {
        new P1172();
    }
}
