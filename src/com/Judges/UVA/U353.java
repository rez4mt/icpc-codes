package com.Judges.UVA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class U353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int count = 0;
            String line = sc.nextLine();
            HashSet<String> set = new HashSet<>();
            for(int i = 0 ; i < line.length();i++ )
            {
                for(int j = i ; j < line.length();j++)
                {
                    String sub = line.substring(i,j+1);
                    if(!set.contains(sub))
                    {
                        StringBuilder b = new StringBuilder(sub);
                        if(sub.equals(b.reverse().toString()))
                        {
                            count++;
                            set.add(sub);
                        }
                    }
                }
            }

            System.out.printf("The string '%s' contains %d palindromes.\n",line,count);
        }
    }
}
