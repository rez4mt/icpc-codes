package com.Judges.uri;

import java.util.Scanner;

public class P1789 {
    public static void main(String[] args) {
        new P1789();
    }


    public P1789()
    {
        int max = 0,tc;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            tc = sc.nextInt();
            for(int i = 0 ; i < tc ; i++)
            {
                max = Math.max(max,sc.nextInt());
            }
            if(max < 10)
                System.out.println("1");
            else if( max >=10 && max < 20)
                System.out.println("2");
            else if( max >= 20)
                System.out.println("3");
            max = 0;
        }
    }
}
