package com.Judges.uri;

import java.util.Scanner;

public class P1067 {
    public P1067()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i +=2)
        {
            System.out.printf("%d\n",i);
        }
    }
    public static void main(String[] args) {
        new P1067();
    }
}
