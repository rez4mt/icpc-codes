package com.Judges.CodeForce.CF155;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        int min = Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i = 0 ; i < T; i ++)
        {
            int num = sc.nextInt();
            if(i == 0)
            {
                min = num;
                max = num;
                continue;
            }
            if(num<min)
            {
                min = num;
                count++;
            }
            if(num>max)
            {
                max = num;
                count++;
            }
        }
        System.out.println(count);
    }
}
