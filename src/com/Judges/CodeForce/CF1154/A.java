package com.Judges.CodeForce.CF1154;

import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for(int i = 0 ; i < 4 ; i++)
            nums[i] = sc.nextInt();
        Arrays.sort(nums);
        int MAX = nums[3];
        int[] ans = new int[3];
        for(int i = 0 ; i < 3; i++)
        {
            ans[i] = MAX - nums[i];
        }
        for(int i = 0 ; i< 3 ; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
