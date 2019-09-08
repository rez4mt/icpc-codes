package com.Judges.uri;

import java.util.Scanner;

public class P1174 {
    public static void main(String[] args) {
        new P1174();
    }


    public P1174()
    {
        Scanner sc = new Scanner(System.in);
        double num ;
        for(int i = 0 ; i < 100 ; i++)
        {
            num = sc.nextDouble();
            if(num<=10)
            {
                System.out.printf("donald[%d] = %.1f\n",i,num);
            }
        }
    }
}
