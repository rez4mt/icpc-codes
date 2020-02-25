package com.Judges.CodeForce.CF1301;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=  sc.nextInt();
        while (T-->0)
        {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            boolean flag = true;
            for(int i = 0 ; i <  a.length() ; i++)
            {
                if((a.charAt(i) != c.charAt(i) && b.charAt(i) != c.charAt(i)))
                {
                    flag = false;
                    break;
                }
            }
            if(!flag)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
