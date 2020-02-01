package com.Judges.kattis;

import java.util.*;

public class pebblesolitaire2 {
    static int min_count = 25 ;
    static int N ;
    static boolean[] list = new boolean[24];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-->0)
        {
            String l = sc.nextLine();
            N = l.length();
            min_count = 25;
            int count = 0 ;
            for(int i = 0 ; i < l.length() ; i++)
            {
                list[i] = l.charAt(i)=='o';
                count+= list[i]?1:0;
            }
            bt(count);
            System.out.println(min_count);
        }
    }
    static void bt(int count)
    {
        for(int i = 2; i < N ;i++)
        {
            if(list[i-2] && list[i-1] && !list[i])
            {
                list[i-2] = false;
                list[i-1] = false;
                list[i] = true;
                bt(count-1);
                list[i-2] = true;
                list[i-1] = true;
                list[i] = false;
            }
            if(list[i] && list[i-1] && !list[i-2])
            {
                list[i] = false;
                list[i-1] = false;
                list[i-2] = true;
                bt(count-1);
                list[i] = true;
                list[i-2] = false;
                list[i-1] = true;
            }

        }
        min_count = Math.min(count , min_count);

    }
}
