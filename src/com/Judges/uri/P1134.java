package com.Judges.uri;

import java.util.Scanner;

public class P1134 {
    public P1134()
    {
        int code = 0;
        Scanner sc = new Scanner(System.in);
        int[] types = new int[3];
        while (code != 4)
        {
            code = sc.nextInt();
            if(code > 3)
                continue;
            types[code-1]++;
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n",types[0]);
        System.out.printf("Gasolina: %d\n",types[1]);
        System.out.printf("Diesel: %d\n",types[2]);
    }
    public static void main(String[] args) {
        new P1134();
    }
}
