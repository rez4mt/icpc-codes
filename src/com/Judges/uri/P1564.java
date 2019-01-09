package com.Judges.uri;

import java.util.Scanner;

public class P1564 {
    public P1564()
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            if(sc.nextInt()>0)
                System.out.println("vai ter duas!");
            else
                System.out.println("vai ter copa!");
        }
    }

    public static void main(String[] args) {
        new P1564();
    }
}
