package com.Judges.uri;

import java.util.Scanner;

public class P1154 {
    public P1154()
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count =0,sum = 0;
        while (n>=0)
        {
            sum+= n;
            count++;
            n = sc.nextInt();
        }
        System.out.printf("%.2f",(double)sum/(double)count);
    }

    public static void main(String[] args) {
        new P1154();
    }
}
