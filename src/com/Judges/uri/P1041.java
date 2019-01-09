package com.Judges.uri;

import java.util.Scanner;

public class P1041 {
    public static void main(String[] args) {
        new P1041();
    }
    public P1041()
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Origem");
            }else {
                System.out.println("Eixo Y");
            }
            return;
        }
        if(b == 0)
        {
            System.out.println("Eixo X");
            return;
        }


        if(a > 0)
        {
            if(b > 0)
            {
                System.out.println("Q1");
            }else{
                System.out.println("Q4");
            }
        }else
        {
            if(b > 0)
            {
                System.out.println("Q2");
            }else{
                System.out.println("Q3");
            }
        }
    }
}
