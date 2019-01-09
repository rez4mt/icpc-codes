package com.Judges.uri;

import java.util.Scanner;

public class P1037 {

    public P1037()
    {
        Scanner sc = new Scanner(System.in);
        double val = Double.parseDouble(sc.next());
        if(val < 0)
        {
            System.out.print("Fora de intervalo\n");
        }else if(val<=25)
        {
            System.out.print("Intervalo [0,25]\n");
        }else if(val <= 50)
        {
            System.out.print("Intervalo (25,50]\n");
        }else if( val <= 75)
        {
            System.out.print("Intervalo (50,75]\n");
        } else if (val <= 100)
        {
            System.out.print("Intervalo (75,100]\n");
        }else if( val > 100)
        {
            System.out.print("Fora de intervalo\n");
        }
    }
    public static void main(String[] args) {
        new P1037();
    }
}
