package com.Judges.uri;

import java.util.Scanner;

public class P1073 {
    public P1073()
    {
        Scanner sc = new Scanner(System.in);
        int l =sc.nextInt();
        for(int i = 2; i <= l ; i +=2)
        {
            System.out.printf("%d^2 = %d\n",i,(int)Math.pow(i,2));
        }
    }
    public static void main(String[] args) {
        new P1073();
    }
}
