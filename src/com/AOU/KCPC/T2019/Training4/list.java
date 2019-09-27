//package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class list {
    public static void main(String[] args) throws Exception{
        Scanner sc  =new Scanner(new File("median.in"));
        int T  =sc.nextInt();
        while (T-->0)
        {
            int N =sc.nextInt();
            int[] list = new int[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = sc.nextInt();
            Arrays.sort(list);
            System.out.println(list[N/2]);
        }
    }
}
