package com.Judges.uri;

import java.util.Scanner;

public class P1046 {
    public P1046()
    {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(),end = sc.nextInt() ;
        int i = start == end?24:0;
        while(start != end)
        {
            start ++;
            if(start >= 24)
                start = 0;
            i ++;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n",i);
    }

    public static void main(String[] args) {
        new P1046();
    }
}
