package com.Judges.uri;

import java.util.Scanner;

public class P1071 {
    public P1071()
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(),n2 = sc.nextInt();
        int f,t;
        if(n1>n2)
        {
            f = n2;
            t = n1;
        }else
        {
            t = n2;
            f = n1;
        }
        int sum = 0;
        for(int i = f+1; i < t;i++)
        {
            if(i%2 != 0)
            {
                sum += i;
            }
        }
        System.out.printf("%d\n",sum);
    }

    public static void main(String[] args) {
        new P1071();
    }
}
