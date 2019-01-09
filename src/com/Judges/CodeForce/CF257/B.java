package com.Judges.CodeForce.CF257;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (sc.nextInt()/2)+1;
        int b = (sc.nextInt()/2)+1;
        if(a==1 && b == 1)
        {
            System.out.println("0 1");
            return;
        }
        System.out.println(Math.max(a,b)+" "+Math.min(a,b));
    }
}
