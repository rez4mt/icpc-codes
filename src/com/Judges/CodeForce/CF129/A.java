package com.Judges.CodeForce.CF129;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] bags = new int[T];
        int sum = 0;
        if(T == 1)
        {
            System.out.println(1);
            return;
        }
        for(int i = 0 ; i < T ; i ++)
        {
            bags[i] = sc.nextInt();
            sum += bags[i];
        }
        boolean even = sum % 2 == 0;
        sum = 0;
        for(int i = 0 ; i < T ; i ++)
        {
            if(even && bags[i]%2 == 0)
                sum++;
            else if(!even && bags[i]%2==1)
                sum++;
        }
        System.out.println(sum);
    }
}
