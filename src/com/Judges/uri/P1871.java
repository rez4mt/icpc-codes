package com.Judges.uri;

import java.util.Scanner;

public class P1871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b ;
        while(sc.hasNext())
        {
            a = sc.nextInt() + sc.nextInt();
            b=String.valueOf(a).replace("0","");
            if(!b.equals(""))
                System.out.println(b);
        }

    }
}
