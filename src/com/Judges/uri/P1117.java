package com.Judges.uri;

import java.util.Scanner;

public class P1117 {
    public P1117()
    {
        int c = 0;
        float a;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        while (c < 2)
        {
            a = sc.nextFloat();
            if(a>=0 && a<=10)
            {
                sum+=a;
                c++;
                continue;
            }

            System.out.println("nota invalida");
        }
        System.out.printf("media = %.2f\n",sum/2);
    }
    public static void main(String[] args) {
        new P1117();
    }
}
