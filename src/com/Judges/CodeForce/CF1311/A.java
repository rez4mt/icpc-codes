package com.Judges.CodeForce.CF1311;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = b - a;
            if(diff == 0)
            {
                System.out.println(0);
            }else
            {
                if(diff>0)
                {
                    if(diff%2==0)
                    {
                        System.out.println(2);
                    }else
                        System.out.println(1);
                }else
                {
                    if(diff%2==0)
                    {
                        System.out.println(1);
                    }else System.out.println(2);
                }
            }

        }
    }
}
