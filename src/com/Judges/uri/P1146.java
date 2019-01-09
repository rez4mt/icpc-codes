package com.Judges.uri;

import java.util.Scanner;

public class P1146 {
    public P1146()
    {
        Scanner sc = new Scanner(System.in);
        int l ;
        while (true)
        {
            l = sc.nextInt();
            if(l == 0)
                break;
            System.out.print("1");
            for(int i = 2 ; i <= l ; i++)
            {
                System.out.printf(" %d",i);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        new P1146();
    }
}
