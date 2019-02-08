package com.Judges.uri;

import java.util.Scanner;

public class P1165 {
    public static void main(String[] args) {
        new P1165();
    }
    public P1165()
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num ,sum ;
        l :
        for(int i = 0 ; i < t ; i ++)
        {
            num = sc.nextInt();
            int v = (int)Math.sqrt(num);
            for( int j = 2 ; j <= v ; j ++)
            {
                if(num % j == 0)
                {
                    System.out.printf("%d nao eh primo\n",num);
                    continue l;
                }
            }
            System.out.printf("%d eh primo\n",num);
        }
    }
}
