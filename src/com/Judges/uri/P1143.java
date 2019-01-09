package com.Judges.uri;

import java.util.Scanner;

public class P1143 {
    public P1143()
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for(int i = 1 ; i <= l ; i++)
        {
            System.out.printf("%d %d %d\n",i,(int)Math.pow(i,2),(int)Math.pow(i,3));
        }

    }
    public static void main(String[] args) {
        new P1143();
    }
}
