package com.Judges.uri;

import java.util.Scanner;

public class P1099 {
    public static void main(String[] args) {
        new P1099();
    }
    public P1099()
    {
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        int x,y,sum=0;
        for(int i = 0 ; i < loops ; i++)
        {
            x = sc.nextInt();
            y = sc.nextInt();
            if(x > y)
            {
                for(int j = y+1 ;j < x ; j++)
                    if(j % 2 == 1)
                        sum += j;

            }else if (y > x)
            {
                for(int j = x+1 ;j < y ; j++)
                    if(j % 2 == 1)
                     sum += j;
            }
            System.out.printf("%d\n",sum);
            sum = 0;
        }

    }
}
