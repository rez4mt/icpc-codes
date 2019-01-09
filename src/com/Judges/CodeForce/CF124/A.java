package com.Judges.CodeForce.CF124;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        int s = 0;
        for(int i = a,j=b;i<n && j>=0;i++,j--)
            s++;
        System.out.println(s);
    }
}
