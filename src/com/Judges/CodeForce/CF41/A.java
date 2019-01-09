package com.Judges.CodeForce.CF41;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(),b = sc.next();
        if(a.length() == b.length())
        {
            int l = a.length();
            for(int i = 0 ; i < l;i++)
            {
                if(!String.valueOf(a.charAt(i)).equals(String.valueOf(b.charAt((l-1)-i))))
                {
                    System.out.println("NO");
                    return ;
                }
            }
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
