package com.Judges.live;

import java.util.Scanner;

public class P5800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0)
        {
            int num = sc.nextInt();
            int rep = sc.nextInt();
            String s = sc.next();
            StringBuilder b = new StringBuilder();
            for(int i = 0 ; i < s.length() ; i ++)
            {
                String p = s.substring(i,i+1);
                for(int j = 0 ; j < rep ; j ++)
                {
                    b.append(p);
                }
            }
            System.out.printf("%d %s\n",num,b.toString());
        }
    }
}
