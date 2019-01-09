//package com.Judges.CodeForce.Contents.R529D3;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        if(n == 2)
        {
            System.out.println(0);
            return;
        }
        int first = nums[n-2] - nums[0];
        int second = nums[n-1] - nums[1];
        System.out.println(Math.min(first,second));
    }
}
