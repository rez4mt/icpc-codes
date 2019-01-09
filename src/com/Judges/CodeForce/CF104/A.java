package com.Judges.CodeForce.CF104;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pointsA = {
                1,2,3,4,5,6,7,8,9,10,10,10,10,
                1,2,3,4,5,6,7,8,9,10,10,10,10,
                1,2,3,4,5,6,7,8,9,10,10,10,10,
                1,2,3,4,5,6,7,8,9,10,10,10
        };
        int[] pointsB = {
                11,2,3,4,5,6,7,8,9,10,10,10,10,
                11,2,3,4,5,6,7,8,9,10,10,10,10,
                11,2,3,4,5,6,7,8,9,10,10,10,10,
                11,2,3,4,5,6,7,8,9,10,10,10
        };
        int n = sc.nextInt();
        if(n<11)
        {
            System.out.println(0);
            return;
        }
        int countA = 0;
        int countB = 0;
        n-=10;
        for (int a :
                pointsA) {
            if(a==n)
            {
                countA++;
            }
        }
        for (int a:
            pointsB)
        {
            if(a==n)
                countB++;
        }
        System.out.println(Math.max(countA,countB));
    }
}
