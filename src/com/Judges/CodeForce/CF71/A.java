package com.Judges.CodeForce.CF71;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String w ;
        for(int i = 0 ; i < l;i++)
        {
            w = sc.next();
            if(w.length()>10)
            {
                System.out.printf("%s%d%s\n",w.charAt(0),w.length()-2,w.charAt(w.length()-1));
            }else
                System.out.println(w);
        }
    }
}
