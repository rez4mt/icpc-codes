package com.Judges.SPOJ;

import java.util.Arrays;
import java.util.Scanner;

public class LEXISORT {
    public static void main(String[] args) {
        String[] s ;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            s = new String[n];
            for(int i = 0 ; i < n ; i ++)
            {
                s[i] = sc.next();
            }
            Arrays.sort(s);
            for(int i = 0 ; i < n ; i++)
            {
                System.out.println(s[i]);
            }
        }
    }

}
