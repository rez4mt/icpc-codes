package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class game {
    public static void main(String[] args)throws IOException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("game.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();

            int[] list = new int[N];
            for(int i = 0 ; i < N ; i++)
            {
                list[i] = sc.nextInt();
            }
            Arrays.sort(list);
            long sum = 0 ;
            for(int i = 0 ; i < N/2;i++)
            {
                long s = list[i] + list[N- 1 - i];
                sum+=Math.pow(s,2);
            }
            System.out.println(sum);
        }
    }
}
