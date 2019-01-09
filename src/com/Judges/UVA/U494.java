package com.Judges.UVA;

import java.util.Scanner;

public class U494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l ,t;
        int s ;
        boolean skip = false;
        while (sc.hasNext())
        {
            s = 0;
            l = sc.nextLine();
            skip =false;
            for(int i = 0 ; i < l.length();i++)
            {
                t = l.substring(i,i+1).toLowerCase();
                if(t.compareTo("a")>=0 && t.compareTo("z")<=0)
                {
                    //it a word
                    if(!skip)
                    {
                        s++;
                        skip = true;
                    }
                }
                else
                    skip = false;
            }
            System.out.println(s);
        }

    }
}
