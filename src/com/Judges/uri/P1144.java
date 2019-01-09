package com.Judges.uri;

import java.util.Scanner;

public class P1144 {
    public static void main(String[] args) {
        new P1144();
    }
    public P1144()
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int p = 0;
        for (int i = 1 ; i <= l ; i++)
        {
            for(int j = 0; j <2;j++)
            {
                p = (int)Math.pow(i,2)+j;
                System.out.printf("%d %d %d\n",i,p,j==0?(p*i):(p*i)-(i-1));
            }
        }
    }
}
