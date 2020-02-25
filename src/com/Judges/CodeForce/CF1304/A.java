package com.Judges.CodeForce.CF1304;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int aa = x - y;
            int bb = b + a;
            if (aa % bb == 0)
                System.out.println(Math.abs(aa / bb));
            else
                System.out.println(-1);

        }
    }
}
