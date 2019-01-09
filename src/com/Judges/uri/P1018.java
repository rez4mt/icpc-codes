package com.Judges.uri;

import java.util.Scanner;

public class P1018 {
    public P1018()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%d\n",num);
        int[] arr = new int[]{100,50,20,10,5,2,1};
        for(int i = 0 ; i < arr.length ; i ++)
        {
            System.out.printf("%d nota(s) de R$ %d,00\n",num / arr[i],arr[i]);
            num = num % arr[i];
        }
    }

    public static void main(String[] args) {
        new P1018();
    }
}
