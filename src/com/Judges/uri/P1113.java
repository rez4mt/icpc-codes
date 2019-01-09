package com.Judges.uri;

import java.util.Scanner;

public class P1113 {
    public P1113()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == b)
                break;

            if(a > b)
            {
                System.out.println("Decrescente");
            }else
            {
                System.out.println("Crescente");
            }
        }
    }
    public static void main(String[] args) {
        new P1113();
    }
}
