package com.practice;

import java.util.HashSet;
import java.util.Scanner;

public class LIS_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String line = sc.nextLine();
            HashSet<String> set = new HashSet<>();
            for(int i = 0 ; i < line.length();i++)
            {

                int temp = 0;
                while (line.charAt(i+temp)==line.charAt(i-temp))
                {
                    set.add(line.substring(i-temp,i+temp+temp));
                    temp++;
                    if(i-temp<0 || i+temp>=line.length())
                        break;
                }
            }
            System.out.println(set);
        }
    }

    private static boolean isPan(String s)
    {
        for(int i = 0 ; i < (s.length()/2)+1;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}
