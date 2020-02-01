package com.Judges.CodeForce.CF510;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> availables = new HashSet<>();
        for(char i ='a' ; i<='z';i++)
            availables.add(i);
        int[] list = new int[26];
        int N = sc.nextInt();
        int prev_char = -1;
        for(int i = 0 ; i < N ;i++)
        {
            String s = sc.next();
            if(prev_char!=-1)
            {

            }
            prev_char = s.charAt(0) ;

        }

    }
}
