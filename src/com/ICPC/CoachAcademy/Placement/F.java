package com.ICPC.CoachAcademy.Placement;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            long sum = 0 ;
            for(int i = 0 ; i < N ; i++)
            {
                for(int j = 0 ; j < N ;j++)
                {
                    //get number
                    int n = sc.nextInt();
                    double sqrt = Math.sqrt(n);
                    int rd = (int)Math.round(sqrt);
                    if(rd*rd == n)
                    {
                        sum+=n;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
