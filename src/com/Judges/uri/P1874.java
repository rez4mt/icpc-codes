package com.Judges.uri;

import java.util.Scanner;

public class P1874 {
    public static void main(String[] args) {
        new P1874();
    }

    public P1874()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c= sc.nextInt();
        String tp ;
        if(a>b)
        {
            if(c>b)
                tp = ":)";
            else
            {
                if(Math.abs(a-b) < Math.abs(c-b))
                {
                    tp = ":(";
                }else
                {
                    tp = ":)";
                }
            }
        }else if(a<b){
            if(c<b)
            {
                tp =":(";
            }else
            {
                if( Math.abs((a-b)) > Math.abs((b-c)))
                    tp =":(";
                else tp = ":)";
            }
        }else
        {
            if(c>b)
                tp = ":)";
            else tp = ":(";
        }
        System.out.println(tp);

    }
}
