package com.Judges.uri;

import java.util.Arrays;
import java.util.Scanner;

public class P1045 {
    public static void main(String[] args) {
        new P1045();
    }
    public P1045()
    {
        double a,b,c ;
        Scanner sc = new Scanner(System.in);
        double[] list = new double[]{Double.parseDouble(sc.next()),Double.parseDouble(sc.next()),Double.parseDouble(sc.next())};
        Arrays.sort(list);
        a = list[2];
        b = list[1];
        c = list[0];
        if(a >= b+c)
        {
            System.out.println("NAO FORMA TRIANGULO");
        }else if(a*a == ( (b*b) + (c*c)))
        {
            System.out.println("TRIANGULO RETANGULO");
        }else if( a*a > (b*b) + (c*c))
        {
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if( a*a < (b*b) + (c*c))
        {
            System.out.println("TRIANGULO ACUTANGULO");
        }


        if(a == c  && b == c)
        {
            System.out.println("TRIANGULO EQUILATERO");
        }else if( a==b || b == c || a == c )
        {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }
}
