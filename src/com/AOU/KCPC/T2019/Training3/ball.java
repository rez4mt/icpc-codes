//package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.Scanner;

public class ball {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("ball.in"));
        //Scanner sc = new Scanner(System.in);
        double k = 1.9318516545454545454545454545455;
        int T = sc.nextInt();
        while (T-->0)
        {
            System.out.printf("%.6f\n", k*Double.valueOf(sc.next()));
        }
    }
}
