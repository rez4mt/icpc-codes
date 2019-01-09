package com.Judges.uri;

import java.util.Scanner;

public class P1178 {
    public P1178()
    {
        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.next());
        for(int i = 0 ; i < 100;i++)
        {
            System.out.printf("N[%d] = %.4f\n",i,num);
            num /= 2.0;
        }

    }
    public static void main(String[] args) {
        new P1178();
    }
}
