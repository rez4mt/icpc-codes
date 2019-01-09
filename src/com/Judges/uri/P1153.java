package com.Judges.uri;

import java.util.Scanner;

public class P1153 {
    public static void main(String[] args) {
        new P1153();
    }
    public P1153()
    {
        Scanner sc = new Scanner(System.in);
        int sum = 1,num;
        num = sc.nextInt();
        for(int i = 0 ; i < num; i++)
        {
            sum *= (num-i);
        }
        System.out.println(sum);
    }
}
