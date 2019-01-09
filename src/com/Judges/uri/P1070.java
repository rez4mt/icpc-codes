package com.Judges.uri;

import java.util.Scanner;

public class P1070 {
    P1070()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = (num%2==0)?num+1:num;i< num+12;i+=2)
        {
            System.out.printf("%d\n",i);
        }
    }

    public static void main(String[] args) {
        new P1070();
    }
}
