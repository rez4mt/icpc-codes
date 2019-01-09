package com.Judges.uri;

import java.util.Scanner;

public class P1012 {
    public P1012()
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c,pi = 3.14159;
        a = Double.parseDouble(sc.next());
        b = Double.parseDouble(sc.next());
        c = Double.parseDouble(sc.next());
        System.out.printf("TRIANGULO: %.3f\n",a*c/2);
        System.out.printf("CIRCULO: %.3f\n",pi*Math.pow(c,2));
        System.out.printf("TRAPEZIO: %.3f\n",((a+b)/2) * c);
        System.out.printf("QUADRADO: %.3f\n",Math.pow(b,2));
        System.out.printf("RETANGULO: %.3f\n",a*b);
    }

    public static void main(String[] args) {
        new P1012();
    }
}
