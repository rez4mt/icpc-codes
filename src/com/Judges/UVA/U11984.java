package com.Judges.UVA;

import java.util.Scanner;

public class U11984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int C = 1;
        while (T-->0)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            double Ac = 9d*A/5 + 32;
            Ac += B;
            Ac = (Ac - 32) *5d/9;
            System.out.printf("Case %d: %.2f\n",C++,Ac);

        }
    }
}
