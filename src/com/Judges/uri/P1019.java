package com.Judges.uri;

import java.util.Scanner;

public class P1019 {
    public P1019()
    {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int h,m ;
        h = seconds / 60 / 60;
        seconds %= 3600;
        m = seconds / 60;
        seconds %= 60;
        System.out.printf("%d:%d:%d\n",h,m,seconds);
    }

    public static void main(String[] args) {
        new P1019();
    }
}
