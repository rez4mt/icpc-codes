package com.Judges.uri;

import java.util.Scanner;

public class P1116 {
    public P1116()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x,y;
        for(int i = 0 ; i < a; i++)
        {
            x = sc.nextInt();
            y = sc.nextInt();
            if(y == 0 )
            {
                System.out.println("divisao impossivel");
                continue;
            }

            System.out.printf("%.1f\n",(float)x/(float)y);

        }
    }
    public static void main(String[] args) {
        new P1116();
    }
}
