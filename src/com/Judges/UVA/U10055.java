package com.Judges.UVA;

import java.util.Scanner;

public class U10055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a ,b ;
        while (sc.hasNext())
        {
            a = sc.nextLong();
            b = sc.nextLong();
            System.out.println(Math.abs(b-a));
        }
    }
}
