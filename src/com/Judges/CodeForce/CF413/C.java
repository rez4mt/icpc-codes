package com.Judges.CodeForce.CF413;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N , M ;
        N = sc.nextInt();
        M = sc.nextInt();
        int[] list = new int[N];
        int[] auc = new int[M];
        long sum = 0 ;
        for(int i = 0 ; i< N ;i++)
        {

            list[i] =sc.nextInt();
            sum+=list[i];
        }
        if(N == 1)
        {
            System.out.println(sum);
            return ;
        }
        for(int i = 0 ; i < M ;i++)
        {
            auc[i] = list[sc.nextInt()-1];
            sum -= auc[i];
        }
        Arrays.sort(auc);
        for(int i = M-1 ; i>= 0;i--)
        {
            sum+=Math.max(sum , auc[i]);
        }

        System.out.println(sum);
    }
}
