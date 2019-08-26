package com.Judges.CodeForce.CF560;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0)
        {
            if(sc.nextInt() == 1)
            {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(1);
    }
}
