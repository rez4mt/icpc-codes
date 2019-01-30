package com.Judges.CodeForce.CF344;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int counts = 0;
        String last = "";
        while (T-->0)
        {
            String a = sc.next();
            if(!a.equals(last))
            {
                counts++;
            }
            last = a;

        }
        System.out.println(counts);
    }
}
