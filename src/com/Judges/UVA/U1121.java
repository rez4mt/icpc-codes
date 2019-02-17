package com.Judges.UVA;

import java.util.Scanner;

public class U1121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int N;
            long S;
            N = sc.nextInt();
             S = sc.nextLong();
            int[] nums = new int[N];
            for(int i = 0; i<N ;i++)
                nums[i] = sc.nextInt();
            long sum = 0;
            int MIN = Integer.MAX_VALUE;
            boolean notFound = false;
            for(int i = 0 ; i< N && !notFound; i++)
            {
                for(int j = i+1 ; j < N ; j++)
                {
                    if(j==N-1)
                        notFound = true;
                    sum+=nums[j];
                    if(sum>=S)
                    {
                        MIN = Math.min(MIN,j-i);
                        break;
                    }
                }
                sum = 0;
            }
            System.out.println(MIN==Integer.MAX_VALUE?0:MIN);
        }
    }
}
