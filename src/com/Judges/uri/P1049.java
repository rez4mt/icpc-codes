package com.Judges.uri;

import java.util.Scanner;

public class P1049 {
    public static void main(String[] args) {
        new P1049();
    }
    public P1049()
    {
        Scanner sc = new Scanner(System.in);
        String f,s,t,p ;
        f = sc.next();
        s = sc.next();
        t = sc.next();
        if(f.equals("vertebrado"))
        {
            if(s.equals("ave"))
            {
                if(t.equals("carnivoro"))
                {
                    p = "aguia";
                }else
                {
                    p = "pomba";
                }
            }else
            {
                if(t.equals("onivoro"))
                {
                    p = "homem";
                }else
                {
                    p = "vaca";

                }
            }
        }else
        {
            if(s.equals("inseto"))
            {
                if(t.equals("hematofago"))
                {
                    p = "pulga";
                }else
                {
                    p = "lagarta";
                }
            }else
            {
                if(t.equals("hematofago"))
                {
                    p = "sanguessuga";
                }else
                {
                    p = "minhoca";
                }
            }
        }

        System.out.printf("%s \n",p);

    }
}
