package com.Judges.UVA;

import java.util.Scanner;

public class U1121 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
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
        }*/
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int N = sc.nextInt();
            long S = sc.nextLong();
            long sum = 0;
            int[] list = new int[N];
            int min = Integer.MAX_VALUE;
            for(int i = 0, j = 0 ; i < N ; i++)
            {
                list[i] = sc.nextInt();
                sum+=list[i];
                while (sum>=S)
                {
                    min = Math.min(min , i - j);
                    sum-=list[j++];
                }

            }
            if(min == Integer.MAX_VALUE)
                System.out.println(0);
            else System.out.println(min+1);
        }

    }
}
