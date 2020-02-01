package com.Judges.CodeForce.CF1285;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int r ;
        int l = r = 0;
        for(int i = 0 ; i < N ; i++)
        {
            if(s.charAt(i)=='L')
                l--;
            else if(s.charAt(i)=='R')
                r++;
        }
        System.out.println(r-l+1);
    }
}
