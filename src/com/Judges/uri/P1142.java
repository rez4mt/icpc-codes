package com.Judges.uri;

import java.util.Scanner;

public class P1142 {
    public static void main(String[] args) {
        new P1142();
    }
    public P1142()
    {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int c = 0;
        for(int i = 0 ; i < lines ; i++)
        {
            System.out.printf("%d %d %d PUM\n",++c,++c,++c);
            c++;
        }
    }
}
