package com.Judges.UVA;

import java.util.Scanner;

public class U10019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int dec = sc.nextInt();
            int hex = Integer.valueOf(String.valueOf(dec),16);
            System.out.printf("%s %s\n",Integer.bitCount(dec),Integer.bitCount(hex));
        }
    }
}
