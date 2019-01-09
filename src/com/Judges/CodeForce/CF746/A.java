package com.Judges.CodeForce.CF746;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = Math.min(Math.min(a,b/2),c/4);

        System.out.println(max+(max*2)+(max*4));
    }
}
