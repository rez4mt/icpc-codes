package com.ICPC.Sharif.P96;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[3];
        int a,b;
        while (true)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0 )
                break;
            prices[0] = (a*30) + (b*40);
            prices[1] = (a*35) + (b*30);
            prices[2] = (a*40) + (b*20);
            System.out.println(Math.min(prices[0],Math.min(prices[1],prices[2])));
        }
    }
}
