package com.Judges.CodeForce.CF1097;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ground = sc.next();
        for(int i = 0; i < 5 ; i++)
        {
            String current = sc.next();
            if(ground.charAt(0) == current.charAt(0))
            {
                System.out.println("YES");
                return;
            }else if(ground.charAt(1) == current.charAt(1))
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}
