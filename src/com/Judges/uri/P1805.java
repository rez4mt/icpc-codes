package com.Judges.uri;

import java.util.Scanner;

public class P1805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        long s = 0;
        for(int i = a;i<=b;i++)
        {
            s+=i;
        }
        System.out.println(s);
    }
}
