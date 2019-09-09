package com.Judges.UVA;

import java.util.Scanner;

public class U10340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String s , t ;
            s = sc.next();
            t = sc.next();
            if(s.length() > t.length())
            {
                System.out.println("No");
                continue;
            }
            int j = 0 ;
            for(int i = 0 ; i < t.length() && j <s.length() ; i++)
            {
                if(t.charAt(i) == s.charAt(j))
                    j++;
            }
            if(j == s.length())
            {
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }
}
