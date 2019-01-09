package com.Judges.uri;

import java.util.Scanner;

public class P1043 {
    public static void main(String[] args) {
        new P1043();
    }
    public P1043()
    {
        double a,b,c ;
        Scanner sc = new Scanner(System.in);
        a = Double.parseDouble(sc.next());
        b = Double.parseDouble(sc.next());
        c = Double.parseDouble(sc.next());
        if(a+b>c && b+c>a && c+a>b)
        {
            System.out.printf("Perimetro = %.1f\n",a+b+c);
        }else
        {
            System.out.printf("Area = %.1f\n",c * ((a+b)/2));
        }
    }
}
