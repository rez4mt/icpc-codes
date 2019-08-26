package com.Judges.CodeForce.CF478;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0 ;
        for(int i = 0 ; i < 5 ;i++)
            sum+=sc.nextLong();
        if(sum%5!=0)
        {
            System.out.println("-1");
        }else
            System.out.println(sum/5);
    }
}
