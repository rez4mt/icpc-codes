package com.AOU.ACPC.T2019.T2;

import java.util.Arrays;
import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] list = sc.next().toCharArray();
        int[] freq = new int[26];
        for(int i = 0 ; i < list.length ; i++)
        {
            freq[list[i] - 'a']++;
        }
        for(int i = 0 ; i < 25 ;i++)
        {
            if(freq[i]<2)
                continue;
            int to_add =freq[i]/2;
            freq[i+1] += to_add;
            freq[i] -= to_add*2;
        }
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i < freq[25];i++)
            b.append('z');
        for(int i = 24 ; i>=0 ; i--)
        {
            if(freq[i]!=0)
                b.append((char)('a'+i));
        }
        System.out.println(b);
    }
}
