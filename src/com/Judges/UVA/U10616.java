package com.Judges.UVA;

import java.util.Scanner;

public class U10616 {
    static int[] nums;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            if(N == 0 && Q == 0)
                break;

            nums = new int[N];
            for(int i = 0 ; i < N ; i++)
                nums[i] = sc.nextInt();

            while (Q-->0)
            {
                int D = sc.nextInt();
                int M = sc.nextInt();
                System.out.println(calculate(D,M,0,N-1));
            }
        }
    }

    private static int calculate(int D,int M,int sum,int i)
    {
        if(i == 0 && M!=0)
            return -1;
        if(M == 0)
        {
            return sum % D == 0 ? 1 : -1;
        }else return 1+Math.max(calculate(D,M-1,sum+nums[i],i-1),calculate(D,M,sum,i-1));
    }
}
