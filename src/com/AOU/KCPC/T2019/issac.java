package com.AOU.KCPC.T2019;

import java.io.File;
import java.util.Scanner;

public class issac {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("issac.in"));
        //Scanner sc = new Scanner(System.in);
        int T =  sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            long val = ((long)n * (n-1) * (n-2))/6;
            System.out.println(val);
        }
    }
}
