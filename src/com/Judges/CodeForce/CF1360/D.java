package com.Judges.CodeForce.CF1360;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            opt(sc.nextInt(),sc.nextInt());
        }
    }
    private static void opt(int n , int k)
    {
        if(n<=k)
        {
            System.out.println(1);
            return;
        }
        if(k == 1)
        {
            System.out.println(n);
            return;
        }

        int min = n;
        int sqrt =(int)Math.sqrt(n);
        for(int i = 2 ; i  <= Math.min(sqrt , k) ; i++)
            if(n%i == 0)
            {
                if(n/i<=k)
                {
                    min = Math.min(i,min);
                    break;
                }else
                {
                    min = Math.min(n/i , min);
                }
            }
        System.out.println(min);
        //System.out.println(n+"/"+k+":"+min);
    }
}


