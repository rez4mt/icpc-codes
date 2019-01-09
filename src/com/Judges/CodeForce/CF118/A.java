package com.Judges.CodeForce.CF118;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        String s ;
        for(int i = 0 ; i < inp.length();i++)
        {
            s = inp.substring(i,i+1);
            switch (s.toLowerCase())
            {
                case "a":
                case "o":
                case "u":
                case "e":
                case "y":
                case "i":
                    continue;
                default:
                    System.out.printf(".%s",s.toLowerCase());
                    break;
            }
        }
        System.out.println();
    }
}
