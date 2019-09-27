//package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.Scanner;

public class girls {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("girls.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int current = Integer.MIN_VALUE;
            StringBuilder sb = new StringBuilder();
            for(int i = 1 ; i <= N ; i++)
            {
                int a = sc.nextInt();
                if(a > current)
                {
                    current = a;
                    sb.append(i+" ");
                }
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
    }
}
