package com.Judges.uri;

import java.util.Scanner;

public class P1021 {
    public P1021()
    {
        Scanner sc = new Scanner(System.in);
        String s_num = sc.next();
        int num,dec ;
        num = Integer.parseInt(s_num.split("\\.")[0]);
        dec = Integer.parseInt(s_num.split("\\.")[1]);
        log("NOTAS:");
        int[] arr = new int[]{100,50,20,10,5,2};
        for(int i : arr)
        {
            log(String.format("%d nota(s) de R$ %d.00",num/i,i));
            num %= i;
        }
        int[] arr2 = new int[]{50,25,10,5,1};
        log("MOEDAS:");
        log(String.format("%d moeda(s) de R$ 1.00",num));
        for(int i : arr2)
        {
            log(String.format("%d moeda(s) de R$ 0.%02d",dec/i,i));
            dec %= i;
        }
    }
    private static void log(Object o)
    {
        System.out.println(o);
    }
    public static void main(String[] args) {
        new P1021();
    }
}
