package com.Judges.CodeForce.CF701;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Character> set = new HashSet<>();
        char[] list = sc.next().toCharArray();
        for(int i = 0 ; i< N ;i++)
            set.add(list[i]);
        int[] found = new int['z'+1];
        int c = 0;
        int min = N;
        for(int i = 0 , j = 0 ; i < N ;i++)
        {
            if(found[list[i]]++ == 0)
                c++;
            while (j<=i && c == set.size())
            {
                min = Math.min(i - j +1 , min );
                if(--found[list[j]] == 0)
                    c--;
                j++;
            }
        }
        System.out.println(min);
    }
}
