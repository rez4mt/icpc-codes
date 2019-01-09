package com.Judges.uri;

import java.util.Scanner;

public class P1035 {
    public static void main(String[] args) {
        new P1035();
    }
    public P1035()
    {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if((b > c) && (d > a) && (c + d > a + b) && c > 0 && d > 0 && (a % 2 == 0))
            System.out.printf("Valores aceitos\n");
        else
            System.out.printf("Valores nao aceitos\n");

    }
}
