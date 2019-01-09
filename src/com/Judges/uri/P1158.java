package com.Judges.uri;

import java.util.Scanner;

public class P1158 {
    public static void main(String[] args) {
        new P1158();
    }
    public P1158()
    {
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        for (int i = 0 ; i < loops ; i++)
        {

            int start = sc.nextInt();
            int ill = sc.nextInt();
            if(start%2 == 0)
                start ++;
            int sum = 0;
            for(int j = 0 ; j < ill ; j++)
            {
                sum += start;
                start +=2;
            }
            System.out.printf("%d\n",sum);
        }
    }
}
