package com.Judges.UVA;

import java.util.HashMap;
import java.util.Scanner;

public class U100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = Math.max(a,b);
            long c = -1;
            for(int i = Math.min(a,b) ; i <= max;i++)
            {

                int aa = cycle(i);
                c = Math.max(c,aa);
            }
            System.out.printf("%d %d %d\n",a,b,c);
        }
    }
    public static int cycle(int n)
    {

        int count = 1;
        while (n!=1)
        {
            if(n%2==1)
            {
                n = 3*n+1;
            }else n = n/2;
            count++;
        }
        return count;
    }
}
