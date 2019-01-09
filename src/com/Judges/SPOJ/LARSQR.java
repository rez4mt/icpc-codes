package com.Judges.SPOJ;

import java.util.Scanner;

public class LARSQR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
            System.out.printf("%.2f\n",Math.pow(sc.nextInt(),2)/2);

    }
}
