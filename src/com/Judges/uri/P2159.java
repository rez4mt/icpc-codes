package com.Judges.uri;

import java.util.Scanner;

public class P2159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double min;
        min = a/Math.log(a);
        System.out.printf("%.1f",min);
        System.out.printf(" %.1f\n", min * 1.25506d );
    }
}
