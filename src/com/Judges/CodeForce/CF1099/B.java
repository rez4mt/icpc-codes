package com.Judges.CodeForce.CF1099;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n2 = n;

        double sqrt = Math.sqrt(n2);

        if(sqrt!=(int)sqrt)
        {
            sqrt = ((int)sqrt)+1;
            n2 =(int) Math.pow(sqrt,2);
        }

        int prev = (int) Math.pow(Math.sqrt(n2)-1,2);
        long distance = n2-prev;
        if(n>prev+(distance/2))
        {
            System.out.printf("%.0f",(sqrt)*2);
        }else
        {
            System.out.printf("%.0f",(sqrt*2)-1);
        }
    }
}
