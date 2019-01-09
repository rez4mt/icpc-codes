package com.Judges.UVA;

import java.util.Scanner;

public class U11192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b ;
        StringBuilder builder;
        while (true)
        {
            a = sc.nextInt();
            builder = new StringBuilder();
            if(a == 0)
                break;
            b = sc.next();
            a = b.length()/a;
            sc.nextLine();
            for(int i = 0 ; i <b.length();i+=a)
            {
                for(int j = a-1 ; j>=0;j--)
                {
                    builder.append(b.charAt(i+j));
                }
            }
            System.out.println(builder.toString());
        }
    }
}
