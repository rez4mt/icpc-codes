//package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.Scanner;

public class east {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("east.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            long w  = sc.nextLong() ;
            long e = sc.nextLong();
            int w_count = 0;
            int e_count = 0;
            for(int i = 0 ; i < N ; i++)
            {
                String sb = sc.next();
                if(sb.charAt(0) == 'E')
                {
                    e_count++;
                }else if(sb.charAt(0) =='W')
                    w_count++;
            }
            System.out.println(w_count);
            System.out.println(e_count);
        }
    }
}
