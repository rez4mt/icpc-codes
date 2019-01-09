package com.Judges.uri;

import java.util.Scanner;

public class P1008 {

    public P1008()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        double m = Double.parseDouble(sc.next());
        System.out.printf("NUMBER = %d\n",num);
        System.out.printf("SALARY = U$ %.2f\n",a*m);

    }

    public static void main(String[] args) {
        new P1008();
    }
}
