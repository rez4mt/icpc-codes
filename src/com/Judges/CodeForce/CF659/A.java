package com.Judges.CodeForce.CF659;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start,n,steps;
        n = sc.nextInt();
        start = sc.nextInt();
        steps = sc.nextInt();
        int tc = 0;

        if(steps>0)
            tc = 1;
        else if(steps<0)
            tc = -1;

        for(int i = 0 ; i < Math.abs(steps) ; i++)
        {
            start+=tc;
            if(start == 0)
                start = n;
            else if(start > n)
                start = 1;
        }
        System.out.println(start);
    }
}
