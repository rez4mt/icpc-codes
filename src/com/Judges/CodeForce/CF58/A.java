package com.Judges.CodeForce.CF58;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        String main = "hello";
        int p = 0;
        Scanner sc = new Scanner(System.in);
        String d = sc.next();
        for(int i = 0 ; i <d.length();i++)
        {
            if(String.valueOf(d.charAt(i)).equals(String.valueOf(main.charAt(p))))
                p++;
            if(p == 5)
                break;
        }

        System.out.println(p==5?"YES":"NO");
    }
}
