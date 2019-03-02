package com.Judges.a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder b ;
        while (T-->0)
        {
             b = new StringBuilder();
             String l = br.readLine();
             char last = '.';
             int count = 0;
             for(int i = 0 ; i < l.length();i++)
             {
                 if(last == l.charAt(i))
                     count++;
                 else
                 {
                     if(count!=0)
                     {
                         b.append(last);
                         b.append(count);
                     }

                     last = l.charAt(i);
                     count = 1;
                 }
             }
            b.append(last);
            b.append(count);
            System.out.println(b.toString());
        }
    }
}
