package com.Judges.uri;

import java.util.Scanner;

public class P1534 {
    public static void main(String[] args) {
        new P1534();
    }
    public P1534()
    {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while (sc.hasNext())
        {
            c = sc.nextInt();
            for(int i = 0 ; i < c ; i++)
            {
                for(int j = 0 ; j < c; j++)
                {
                    if(i+j == c-1)
                    {
                        System.out.print("2");
                    }else if( i == j)
                    {
                        System.out.print("1");
                    }else{
                        System.out.print("3");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
