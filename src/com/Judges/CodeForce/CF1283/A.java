package com.Judges.CodeForce.CF1283;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int H = sc.nextInt();
            int M = sc.nextInt();
            int remH = 23 - H ;
            int remM = 60 - M;
            long ans = (remH*60l) + (remM);
            System.out.println(ans)
            ;
        }

    }
}
