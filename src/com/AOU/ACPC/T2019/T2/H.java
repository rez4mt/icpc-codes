package com.AOU.ACPC.T2019.T2;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double ans = (double)N*5 / (double)K;
        if(ans%5!=0)
            ans += 5 - (ans%5);
        System.out.printf("%.0f\n",Double.max(10,ans));
    }
}
