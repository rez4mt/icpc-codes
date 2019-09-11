package com.Judges.UVA;

import java.util.Scanner;

public class U12482 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int N = sc.nextInt();
            int L = sc.nextInt();
            int C = sc.nextInt();

            int lines_count = 1 ;
            int current_char = 0;
            while (N-->0)
            {
                String s = sc.next();
                if(s.length() + current_char > C)
                {
                    current_char = 0;
                    lines_count ++;
                }
                current_char += s.length()+1 ;
            }

            int pages_count = (int) Math.ceil((lines_count / (double)L)) ;
            System.out.println(pages_count);
        }
    }
}
