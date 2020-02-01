package com.Judges.kattis;

import java.util.*;

public class perfectpower2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            boolean neg = false;
            if (n<1)
            {
                neg = true;
                n *= -1;
            }
            if (n==0)
                break;
            boolean b = true;
            boolean even = false;
            double x;
            int sqrt =(int) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                 x = Math.log(n)/Math.log(i);
                if (x==(int)x) {
                    b = false;
                    if (neg && (int)x%2==0)
                        even = true;
                    if (!even|| !neg)
                        System.out.println((int)x);
                    break;
                }
            }
            if (neg && even)
                b = true;
            if (b)
                System.out.println(1);
        }
    }
}
