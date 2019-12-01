package com.Judges.CodeForce.CF236;

import java.util.HashSet;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        HashSet<Character> aa = new HashSet<>();
        for(int i = 0 ; i < s.length; i++)
            aa.add(s[i]);
        if(aa.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}
