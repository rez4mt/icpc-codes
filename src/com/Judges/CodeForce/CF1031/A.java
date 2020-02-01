package com.Judges.CodeForce.CF1031;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int k = sc.nextInt();
        long sum = 0 ;

        for(int i = 1 ; i<=k*2 ; w-=2,h-=2, i++)
        {

            if(i%2 == 1)
                sum+= w*h;
            else
                sum -= w*h;
        }
        System.out.println(sum);
    }
}
