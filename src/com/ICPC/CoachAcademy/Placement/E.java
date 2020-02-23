package com.ICPC.CoachAcademy.Placement;

import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[27];
            for(int i = 0 ; i < N ; i++)
                freq[s.charAt(i)-'a']++;
            int count = 0 ;
            char ch = ' ';
            for(int i = 0 ; i < 27 ;i++)
            {
                if(freq[i] > count)
                {
                    count = freq[i];
                    ch = (char)(i+'a');
                }
            }
            System.out.println(ch);
        }
    }
}
