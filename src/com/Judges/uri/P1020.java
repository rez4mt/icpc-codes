package com.Judges.uri;

import java.util.Scanner;

public class P1020 {
    public P1020()
    {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int y = days / 365;
        days %= 365;
        int m = days / 30;
        days %= 30;
        System.out.printf("%d ano(s)\n",y);
        System.out.printf("%d mes(es)\n",m);
        System.out.printf("%d dia(s)\n",days);

    }

    public static void main(String[] args) {
        new P1020();
    }
}
