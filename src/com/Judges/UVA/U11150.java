package com.Judges.UVA;

import java.util.Scanner;

public class U11150 {
    public static void main(String[] args) {
        int a ,sum = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            a = sc.nextInt();
            sum = a;
            while (a>=3)
            {
                sum += a/3;
                a = a/3 + (a%3);
            }
            if(a == 2)
                sum++;

            System.out.println(sum);

        }
    }
}
