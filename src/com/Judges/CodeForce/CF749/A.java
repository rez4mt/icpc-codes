package com.Judges.CodeForce.CF749;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/2;
        int b = n%2;
        StringBuffer buffer = new StringBuffer();
        if(n%2 == 0 )
        {
            System.out.println(a);
            for(int i = 0 ; i < a ; i++)
                buffer.append("2 ");
            System.out.println(buffer.substring(0,buffer.length()-1).toString());
        }else
        {
            System.out.println(a);
            for(int i = 0 ; i < a-1 ; i++)
                buffer.append("2 ");
            buffer.append(3);
            System.out.println(buffer.toString());
        }
    }
}
