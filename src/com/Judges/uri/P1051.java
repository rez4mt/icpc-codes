package com.Judges.uri;

import java.util.Scanner;

public class P1051 {
    public static void main(String[] args) {
        new P1051();
    }
    public P1051()
    {
        double to_print = 0.0,income = 0.0;
        Scanner sc = new Scanner(System.in);
        //more accurate than nextDouble sometimes..
        income = Double.parseDouble(sc.next());
        if(income < 2000)
        {
            System.out.print("Isento\n");
            return;
        }else if(income > 2000 && income <= 3000)
        {
            to_print = (income - 2000) * 0.08;
        }else if(income > 3000 && income <= 4500)
        {
            to_print = 80.0 + ((income - 3000.0) * 0.18);
        }else if(income>4500)
        {
            to_print = 80.0 + 270.0 + ((income - 4500.0) * 0.28);
        }

        System.out.printf("R$ %.2f\n",to_print);
    }
}
