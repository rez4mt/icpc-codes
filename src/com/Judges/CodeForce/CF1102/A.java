package com.Judges.CodeForce.CF1102;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sum = 0 ;
        for(long i = n ; i >0 ; i--)
        {
            if(sum - i >= 0)
                sum -= i;
            else sum+=i;
        }
        System.out.println(sum);

    }
}
