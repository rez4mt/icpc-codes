package com.Judges.uri;

import java.util.Scanner;

public class P1115 {
    public P1115()
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String s;
        for(;;)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 || b == 0)
                break;
            s = "";
            if(a > 0)
            {
                if(b > 0 )
                {
                    s += "primeiro";
                }else
                {
                    s += "quarto";
                }
            }else
            {
                if(b > 0 )
                {
                    s += "segundo";
                }else
                {
                    s += "terceiro";
                }
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new P1115();
    }
}
