package com.Judges.CodeForce.CF61;

import java.math.BigInteger;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < a.length(); i ++)
        {
            if(a.charAt(i) == '1' && b.charAt(i) =='1')
            {
                sb.append(0);
            }else if(a.charAt(i)=='1' || b.charAt(i)=='1')
            {
                sb.append(1);
            }else sb.append(0);
        }
        System.out.println(sb.substring(sb.length()-a.length()));
    }
}
