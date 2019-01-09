package com.ICPC.Sharif.P97;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if(c+d > (a*b))
        {
            System.out.println((c+d)%a*b);
        }else System.out.println(c+d);
    }
}
