package com.Judges.CodeForce.CF27;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] m = new int[T];
        for(int i = 0 ; i < T ; i ++)
            m[i] = sc.nextInt();
        Arrays.sort(m);
        int C = 1;
        for(int i = 0 ; i < T ; i ++)
        {
            if(m[i] == C)
            {
                C++;
            }else
            {
                System.out.println(C);
                return;
            }
        }
        System.out.println(C);
    }
}
