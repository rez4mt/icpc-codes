package com.Judges.CodeForce.CF1095;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder b = new StringBuilder();
        int a = sc.nextInt();
        String s = sc.next();
        int current = 1;
        for(int i = 1 ; current <= a ; i ++)
        {
            b.append(s.charAt(current-1));
            current+=i;
        }
        System.out.println(b);
    }
}
