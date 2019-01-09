package com.Judges.UVA;

import java.util.Scanner;

public class U579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l;
        while (sc.hasNext())
        {
            l = sc.nextLine();
            int h = Integer.valueOf(l.substring(0,l.indexOf(":")));
            int m = Integer.valueOf(l.substring(l.indexOf(":")+1));
            if(m==0 && h == 0)
                break;
            double ang = Math.abs(.5d * (60*h - 11*m));
            if(ang>180) ang = 360 - ang;
            System.out.printf("%.3f\n", ang);
        }
    }
}
