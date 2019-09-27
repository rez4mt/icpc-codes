package com.Judges.a2;

import java.util.Scanner;

public class A350 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 1)
            System.out.println("Don't be lazy, it takes only few minutes, you can do it.");
        else if(N == 1)
            System.out.println("Good Job");
        else System.out.println("You Rocks Man");
    }
}
