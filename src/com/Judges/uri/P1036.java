package com.Judges.uri;

import java.util.Scanner;

public class P1036 {
    public static void main(String[] args) {
        new P1036();

    }
    public P1036()
    {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next()),b = Double.parseDouble(sc.next()),c = Double.parseDouble(sc.next());
        if(a == 0)
        {
            System.out.println("Impossivel calcular");
            return;
        }
        double delta = (b*b) - (4 * a * c);
        if(delta < 0)
        {
            System.out.println("Impossivel calcular");
            return;
        }
        double r1,r2;
        r1 = (-b + Math.sqrt(delta)) / (2*a);
        r2 = (-b - Math.sqrt(delta)) / (2*a);
        System.out.printf("R1 = %.5f\n",r1);
        System.out.printf("R2 = %.5f\n",r2);
    }
}
