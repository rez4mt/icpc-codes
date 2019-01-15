package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class DP1 {
    public static void main(String[] args) {
        //how many subset with sum of S
        int[] nums = {2,4,6,10};
        int S = 16;
        System.out.println(count(S,nums));
    }
    static int count(int sum,int[] nums)
    {
        return rec(nums,sum,nums.length-1);

    }
    static int rec(int[] arr,int total,int i)
    {
        if(total == 0)
            return 1;
        if(i < 0 )
            return 0;
        if(total < arr[i])
        {
            return rec(arr,total,i-1);
        }else
            return rec(arr,total-arr[i],i-1) +
                    rec(arr,total,i-1);
    }

}
