package com.Judges.uri;

import java.util.Scanner;

public class P1180 {
    public static void main(String[] args) {
        new P1180();
    }
    public P1180()
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        int[] smallest = new int[2];
        smallest[0] = sc.nextInt();
        int num ;
        for(int i = 1 ; i < nums.length; i ++)
        {
            num = sc.nextInt();
            if(num< smallest[0])
            {
                smallest[0] = num;
                smallest[1] = i;
            }
        }
        System.out.printf("Menor valor: %d\nPosicao: %d\n",smallest[0],smallest[1]);

    }
}
