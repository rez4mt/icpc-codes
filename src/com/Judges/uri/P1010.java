package com.Judges.uri;

import java.util.Scanner;

public class P1010 {
    public P1010()
    {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int am_1 = sc.nextInt();
        double p_1 = Double.parseDouble(sc.next());
        sc.nextInt();
        int am_2 = sc.nextInt();
        double p_2 = Double.parseDouble(sc.next());
        System.out.printf("VALOR donald PAGAR: R$ %.2f\n",(p_1*am_1)+(p_2*am_2));

    }
    public static void main(String[] args) {
        new P1010();
    }
}
