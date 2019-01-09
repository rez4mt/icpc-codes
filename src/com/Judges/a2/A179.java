package com.Judges.a2;

import java.util.Scanner;

public class A179 {
    private static int LCM(int a, int b)
    {
        for(int i = 1; i <= b; i++) {
            if(i*a % b == 0)
                return Math.abs(i*a);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            System.out.println(LCM(7,sc.nextInt()));
        }
    }
}
