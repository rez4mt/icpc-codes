package com.Judges.CodeForce.CF474;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        String m = "qwertyuiop" +
                "asdfghjkl;" +
                "zxcvbnm,./";
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextLine().equals("R")?-1:1;
        String s = sc.next();
        for(int i = 0 ; i< s.length(); i++)
        {
            System.out.print(m.charAt(m.indexOf(s.substring(i,i+1))+pos));
        }
        System.out.println();
    }
}
