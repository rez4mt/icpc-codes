package com.Judges.CodeForce.CF682;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A = Math.max(a,b);
        int B = Math.min(a,b);
        long count = 0;
        for(int i = 1 ; i <= A ; i++)
        {
            int mod = i % 5;
            if(mod>=B)
                continue;
            count+=(B - (5-mod))/5;
            count++;
        }
        System.out.println(count);
    }

}