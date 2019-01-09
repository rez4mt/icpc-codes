package com.Judges.CodeForce.CF59;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int lower=0,upper=0;
        for(int i = 0 ; i < a.length();i++)
        {
            if(Character.isUpperCase(a.charAt(i)))
                upper++;
            else
                lower++;
        }
        System.out.println(lower<upper?a.toUpperCase():a.toLowerCase());
    }
}
