package com.Judges.SPOJ;

import java.util.Scanner;

public class EMTY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            String s = sc.next();
            while (s.length() > 2 && s.contains("100"))
                s = s.replace("100","");
            if(s.equals(""))
            {
                System.out.printf("Case %d: yes",i+1);
            }else
            {
                System.out.printf("Case %d: no",i+1);
            }
        }
    }
}
