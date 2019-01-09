package com.Judges.CodeForce.CF200;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            sum+=sc.nextInt();
        }
        System.out.printf("%.12f\n",(double)sum/n);
    }
}
