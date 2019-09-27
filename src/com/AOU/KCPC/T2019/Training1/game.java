package com.AOU.KCPC.T2019.Training1;

import java.io.File;
import java.util.Scanner;

public class game {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("game.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            long N = sc.nextLong();
            long B = sc.nextLong();
            long x = B*9;
            System.out.println(N + x);
        }
    }
}
