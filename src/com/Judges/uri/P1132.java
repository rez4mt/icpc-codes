package com.Judges.uri;

import java.util.Scanner;

public class P1132 {
    public static void main(String[] args) {
        new P1132();
    }
    public P1132()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt();
        int sum = 0;
        for(int i = x>y?y:x ; i <= (x>y?x:y) ; i++)
        {
            if( i  % 13 != 0)
                sum += i;
        }
        System.out.printf("%d\n",sum);

    }
}
