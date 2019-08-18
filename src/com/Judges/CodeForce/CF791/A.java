package com.Judges.CodeForce.CF791;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        int count = 0 ;
        while(A<=B)
        {
            A*=3;
            B*=2;
            count++;
        }
        System.out.println(count);
    }
}
