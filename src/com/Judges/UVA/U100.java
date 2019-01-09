package com.Judges.UVA;

import java.util.Scanner;

public class U100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("%d %d %d\n",a,b,check(a,b));
        }
    }
    public static int check(int a , int b )
    {
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int count = 0 , res = 0;
        while (min<=max)
        {
            int x = min;
            while (x!=1)
            {
                if(x%2==0)
                    x = x/2;
                else x = (3*x)+1;
                count++;
            }
            res = Math.max(count,res);
            count = 1;
            min++;
        }
        return res;
    }
}
