package com.Judges.uri;

import java.util.Scanner;

public class P1005 {
    public static void main(String[] args) {
        new P1005();
    }
    P1005()
    {
        float a,b,med ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        med = (float)(((a*3.5) + (b*7.5)) / (3.5 + 7.5));
        System.out.printf("MEDIA = %.5f\n",med);
    }
}
