package com.Judges.CodeForce.CF339;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int[] counts = new int[3];
        Scanner sc = new Scanner(System.in);
        String d = sc.next();
        String l ;
        for(int i = 0 ; i < d.length() ;i++)
        {
            l = String.valueOf(d.charAt(i));
            if(l.equals("1"))
            {
                counts[0]++;
            }else if(l.equals("2"))
            {
                counts[1]++;
            }else if(l.equals("3"))
            {
                counts[2]++;
            }
        }
        String m = "";
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < counts[i];j++)
            {
                if(i == 0)
                {
                    m+="1+";
                }else if(i == 1)
                    m+= "2+";
                else if(i==2)
                    m+="3+";
            }
        }
        System.out.println(m.substring(0,m.length()-1));
    }
}
