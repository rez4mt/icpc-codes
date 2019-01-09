package com.Judges.CodeForce.CF131;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.toUpperCase().equals(a))
        {
            System.out.println(a.toLowerCase());
        }else if(Character.isLowerCase(a.charAt(0)) && a.substring(1).toUpperCase().equals(a.substring(1)))
        {
            System.out.println(a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase());
        }else
            System.out.println(a);

    }
}
