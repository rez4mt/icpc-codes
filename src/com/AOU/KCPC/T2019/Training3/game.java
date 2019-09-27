//package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.Scanner;

public class game {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("game.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            String s = sc.next();
            boolean lowerCase = Character.isLowerCase(s.charAt(0));
            int longest_length  = -1 ;
            StringBuilder current = new StringBuilder() ;
            StringBuilder lower = new StringBuilder();
            for(int i = 0 ; i < s.length() ;i++)
            {
                if(Character.isLowerCase(s.charAt(i)))
                    lower.append(s.charAt(i));
                else current.append(s.charAt(i));

            }
            if(current.length()>=lower.length())
                System.out.println(current.toString());
            else System.out.println(lower.toString());
        }
    }
}
