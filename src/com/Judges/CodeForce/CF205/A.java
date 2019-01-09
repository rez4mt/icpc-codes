package com.Judges.CodeForce.CF205;

import java.util.HashSet;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int min = 0;
        int index = 0;
        int min_count = 0;
        for(int i = 0 ; i < T ; i ++)
        {
            int num = sc.nextInt();
            if(num == min)
            {
                min_count++;
            }
            if(min == 0 || num<min)
            {
                min = num;
                min_count = 1;
                index = i+1;
            }
        }
        System.out.println(min_count==1?index:"Still Rozdil");
    }
}
