package com.Judges.CodeForce.CF734;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k2,k3,k5,k6;
        k2 = sc.nextInt();
        k3 = sc.nextInt();
        k5 = sc.nextInt();
        k6 = sc.nextInt();
        int max256 = Math.min(Math.min(k2,k5),k6);
        k2 -= max256;
        k5 -= max256;
        k6 -= max256;
        int max32 = Math.min(k3,k2);
        int sum = 0;
        sum+=max256*256;
        sum+=max32*32;
        System.out.println(sum);
    }
}
