package com.Judges.uri;

import java.util.Scanner;

public class U1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder b ;
        sc.nextLine();
        while (T-->0)
        {
            b = new StringBuilder();
            String s = sc.nextLine();
            int hashPos = 0;

            int[] isAlph = new int[s.length()];
            for(int i = 0; i < s.length() ; i++)
            {

                char c = s.charAt(i);
                if(c == '#')
                    hashPos = s.length() - i;
                if(Character.isAlphabetic(c))
                {
                    isAlph[i] = 1;
                    b.append((char) (c+2));
                }
                else b.append(c);
            }
            System.out.println(b);
            char[] chars = b.reverse().toString().toCharArray();
            for(int i = s.length()-1 ; i < chars.length/2 ; i++)
            {
                if(isAlph[s.length()-1-i] == 1)
                    chars[i] = (char) (chars[i]+1);
            }
            System.out.println(chars);
        }
    }
}
