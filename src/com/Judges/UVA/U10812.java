package com.Judges.UVA;

import java.util.Scanner;

public class U10812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            if(d>s)
            {
                System.out.println("impossible");
            }else
            {
                int x = (s-d)/2;
                int y = s-x;
                if(x<0 || y<0 || x+y!=s || Math.abs(x-y)!=d)
                {
                    System.out.println("impossible");
                }else System.out.printf("%d %d\n",Math.max(x,y),Math.min(x,y));
            }
        }
    }
}
