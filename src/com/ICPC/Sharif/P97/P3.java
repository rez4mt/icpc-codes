package com.ICPC.Sharif.P97;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long m ;
        long sum = a ;
        for(int i = 2;i<=(a/2);i++)
        {
            m = a%i;
            if(m!=0)
                continue;
            System.out.println(i);
            sum += m;
        }
        System.out.println(sum);
        boolean ok = false;

    }
}
