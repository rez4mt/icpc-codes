package com.Judges.CodeForce.CF782;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        for(int i = 0 ; i < N*2 ;i++)
            sum += sc.nextInt();
        System.out.println(sum/(N*2));
    }
}
