package com.Judges.uri;

import java.util.Scanner;

public class P1075 {
    public P1075()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2 ; i <= 10000 ;i+=n)
        {
            if(i%n == 2)
                System.out.println(i);
        }

    }

    public static void main(String[] args) {
        new P1075();
    }
}
