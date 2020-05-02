package com.Judges.CodeForce.CF1335;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            long n = sc.nextLong();
            if(n<3)
            {
                System.out.println(0);
            }else
            {
                if(n%2==0)
                {
                    System.out.println(n/2 - 1);
                }else System.out.println(n/2);
            }
        }
    }
}
