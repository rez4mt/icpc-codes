package com.Judges.UVA;

import java.util.*;

public class U13216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        while (T-->0)
        {
            String l = sc.next();
            int v;
            if(l.length()>2)
                v = ((l.charAt(l.length()-2) - '0') * 10) + (l.charAt(l.length()-1) - '0');
            else v = Integer.valueOf(l);
            if(l.length() == 1 && v == 0 )
                System.out.println(1);
            else if( l .length() == 1 && v == 1)
                System.out.println(66);
            else {
                int m = v % 5;
                switch (m)
                {
                    case 0:
                        System.out.println(76);
                        break;
                    case 1:
                        System.out.println(16);
                        break;
                    case 2:
                        System.out.println(56);
                        break;
                    case 3:
                        System.out.println(96);
                        break;
                    case 4:
                        System.out.println(36);
                        break;
                }
            }
        }
    }
}
