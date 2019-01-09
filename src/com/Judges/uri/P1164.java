package com.Judges.uri;

import java.util.Scanner;

public class P1164 {
    public static void main(String[] args) {
        new P1164();
    }
    public P1164()
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num ,sum ;
        for(int i = 0 ; i < t ; i ++)
        {
            num = sc.nextInt();
            sum = 0;
            for( int j = 1 ; j <= num/2 ; j ++)
            {
                if(num % j == 0)
                    sum += j;
            }
            if(sum == num)
                System.out.printf("%d eh perfeito\n",num);
            else
                System.out.printf("%d nao eh perfeito\n",num);
        }
    }
}
