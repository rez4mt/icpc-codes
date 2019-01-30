package com.Judges.CodeForce.CF557;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        int count = 0;
        for(int i = 1 ; i <= a ; i++)
            if(b%i == 0 && b/i<=a)
                count++;

        System.out.println(count);
    }
}
