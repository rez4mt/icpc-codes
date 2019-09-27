package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.Scanner;

public class time {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("smallest.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            long h = sc.nextInt();
            long m = sc.nextInt();
            long s = sc.nextInt();
            s +=m*60;
            s +=60*h*60;
            s += sc.nextInt();
            h = s / 3600 ;
            m = (s % 3600) / 60;
            s = (s % 3600) % 60;
            System.out.printf("%d %d %d\n",h % 24 , m ,s);
        }
    }
}
