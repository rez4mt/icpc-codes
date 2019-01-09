package com.Judges.CodeForce.CF112;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.next().toLowerCase().compareTo(sc.next().toLowerCase());
        if(c==0)
            System.out.println(0);
        else if(c>0)
            System.out.println(1);
        else
            System.out.println(-1);

    }
}
