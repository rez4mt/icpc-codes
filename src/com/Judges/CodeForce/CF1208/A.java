package com.Judges.CodeForce.CF1208;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] fib = new int[3];
        while (T-->0)
        {
            int a = sc.nextInt() , b = sc.nextInt() , n = sc.nextInt();
            fib[0] = a ;
            fib[1] = b;
            if(n < 2)
            {
                System.out.println(fib[n]);
            }else
            {
                for(int i = 1; i < n ; i++)
                {
                    fib[2] = fib[0] ^ fib[1];
                    fib[0] = fib[1];
                    fib[1] = fib[2];
                }
                System.out.println(fib[2]);
            }

        }
    }
}
