package com.Judges.CodeForce.CF1307;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[26];
        String s = sc.next();
        int[] frq = new int[26];
        long[][] occ = new long[26][26];
        long ans = 0 ;
        for(int i  = 0 ; i < s.length() ; i++)
        {
            int chr = s.charAt(i)-'a';
            for(int j = 0 ; j < 26 ; j++)
            {
                occ[j][chr] += frq[j];
            }
            frq[chr] ++;
        }
        for(int i = 0 ; i  <  26 ; i++)
        {
            ans = Math.max(ans , frq[i]);
            for(int j = 0 ; j <  26 ; j++)
            {
                ans = Math.max(occ[i][j],ans);
            }
        }
        System.out.println(ans);

    }
}
