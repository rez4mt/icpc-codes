package com.Judges.CodeForce.CF1307;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[26];
        String s = sc.next();
        for(int i = 0 ; i < s.length();i++)
            list[s.charAt(i)-'a']++;
        long sum = 1;
        for(int i = 0 ; i < list.length ; i++)
        {
            sum*=list[i]==0?1:list[i];
        }
        System.out.println(sum);
    }
}
