package com.Judges.a2;

import java.util.Scanner;

public class A355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder b = new StringBuilder();
        for(int i = 1 ; i <= N ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                b.append("*");
            }
            b.append("\n");
        }
        System.out.print(b.toString());
    }
}
