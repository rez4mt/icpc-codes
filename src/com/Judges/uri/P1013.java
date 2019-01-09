package com.Judges.uri;

import java.util.Scanner;

public class P1013 {
    public P1013()
    {
        Scanner sc = new Scanner(System.in);
        int max = gr(sc.nextInt(),gr(sc.nextInt(),sc.nextInt()));
        System.out.printf("%d eh o maior\n",max);
    }
    private static int gr(int a,int b)
    {
        return (a+b+Math.abs(a-b))/2;
    }
    public static void main(String[] args) {
        new P1013();
    }
}
