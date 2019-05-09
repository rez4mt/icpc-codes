package com.Judges.UVA;

import java.util.Scanner;

public class U10812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            long s = sc.nextLong();
            long d = sc.nextLong();
            if(d>=s)
            {
                System.out.println("impossible");
            }else
            {
                if((s%2 + d%2) % 2 != 0)
                {
                    System.out.println("impossible");
                    continue;
                }
                long a = (s/2) + (d/2);
                long b = s - a ;

                if(a<0 || b<0)
                {
                    System.out.println("impossible");
                }else
                {
                    long max = Math.max(a,b);
                    long min = Math.min(a,b);
                    System.out.print(max+" ");
                    System.out.println(min);
                }
            }
        }
    }
}
