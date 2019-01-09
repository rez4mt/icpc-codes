package com.Judges.CodeForce.CF110;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if(num.length()==1 || (num.contains("7") && !num.contains("4")) || (num.contains("4") && !num.contains("7")))
        {
            System.out.println("NO");
            return;
        }
        num = num.replace("7","").replace("4","");

        if(num.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
