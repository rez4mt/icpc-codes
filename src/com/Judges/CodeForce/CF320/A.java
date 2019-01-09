package com.Judges.CodeForce.CF320;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        while (n.contains("144"))
            n = n.replace("144"," ");
        while (n.contains("14"))
            n = n.replace("14"," ");
        while (n.contains("1"))
            n = n.replace("1"," ");
        System.out.println(n.trim().isEmpty()?"YES":"NO");
    }
}
