//package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.Scanner;

public class vote {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("vote.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int result = Integer.MIN_VALUE;
            for(int i = 0 ; i < 3 ; i++)
                result = Math.max(result , sc.nextInt());

            System.out.println(result);
        }
    }
}
