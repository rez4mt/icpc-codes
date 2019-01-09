package com.Judges.uri;

import java.util.Scanner;

public class P1044 {
    public P1044()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        if(b%a==0 || a%b == 0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");

    }

    public static void main(String[] args) {
        new P1044();
    }
}
