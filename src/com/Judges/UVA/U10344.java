package com.Judges.UVA;

import java.util.Scanner;

public class U10344 {
    static int[] nums ;
    static boolean[] used ;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        used = new boolean[5];
        nums = new int[5];

        while (true)
        {
            flag = false;
            for(int i = 0 ; i < 5 ; i++)
            {
                used[i] = false;
                nums[i] = sc.nextInt();

            }
            if(nums[0] == 0 && nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[3] && nums[3] == nums[4])
                break;

            for(int i = 0 ; i < 5 && !flag; i++)
            {
                used[i] = true;
                check(1,nums[i]);
                used[i] = false;
            }
            if(!flag)
                System.out.println("Impossible");
            else
                System.out.println("Possible");
        }
    }
    private static void check(int idx,int val)
    {
        if(idx == 5 && val == 23)
        {
            flag = true;
            return ;
        }
        boolean flag = false;
        for(int i = 0 ; i < 5 ; i++)
        {
            if(!used[i])
            {

                used[i] = true;
                check(idx+1 , val+nums[i]);
                check(idx+1 , val*nums[i]);
                check(idx+1 , val-nums[i]);
                used[i] = false;
            }
        }

    }
}
