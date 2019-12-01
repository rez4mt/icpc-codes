package com.AOU.ACPC.T2019.T1;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int X = sc.nextInt();
        double d = (Math.log10(S)/Math.log10(X));
        boolean add = false;
        if(Math.abs(d - ((int)d)) <= 10e-9)
            add = true;
        int v =(int) Math.ceil(d);
        if(add)v++;
        System.out.println(v);
    }
}
