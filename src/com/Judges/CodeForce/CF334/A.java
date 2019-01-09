package com.Judges.CodeForce.CF334;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder b = new StringBuilder();
        int n = sc.nextInt();
        int k = n*n;
        for(int i = 1 ; i <= k/2 ; i ++)
        {
            b.append(String.format("%d %d\n",i,k+1-i));
        }
        System.out.print(b);

    }
}
