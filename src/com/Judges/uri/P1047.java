package com.Judges.uri;

import java.util.Scanner;

public class P1047 {
    public P1047()
    {
        Scanner sc = new Scanner(System.in);

        int sh = sc.nextInt();
        int sm = sc.nextInt();
        int eh = sc.nextInt();
        int em = sc.nextInt();
        int h = eh - sh;

        int m = em - sm;
        if(m < 0)
        {
            m = 60 + m;
            h --;
        }
        if(h<0)
            h = 24 + h;
        if(h == 0 && m == 0)
            log("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        else
            log(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",h,m));

    }

    public static void main(String[] args) {
        new P1047();
    }
    private static void log(Object... o)
    {
        for(Object o2 : o)
            System.out.println(o2);
    }
}
