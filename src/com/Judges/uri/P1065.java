package com.Judges.uri;

import java.util.Scanner;

public class P1065 {
    public P1065()
    {
        Scanner sc = new Scanner(System.in);
        int count=0 ;
        int val ;
        for(int i =0 ;i<5;i++)
        {
            if(sc.nextInt()%2 == 0)
                count++;
        }
        System.out.printf("%d valores pares\n",count);
    }

    public static void main(String[] args) {
        new P1065();
    }
}
