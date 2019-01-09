package com.Judges.a2;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

    }

    public A1()
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 0 ; i < tc ; i++)
        {
            System.out.println(sc.nextInt()+sc.nextInt());
        }
    }
}
