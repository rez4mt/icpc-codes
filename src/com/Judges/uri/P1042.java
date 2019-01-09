package com.Judges.uri;

import java.util.Scanner;

public class P1042 {
    public P1042()
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        int[] order = new int[3];

        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();
        nums[2] = sc.nextInt();

        order[0] = Math.min(nums[0],Math.min(nums[1],nums[2]));

        if(order[0] == nums[0])
        {
            order[1] = Math.min(nums[1],nums[2]) ;
            order[2] = Math.max(nums[1],nums[2]) ;
        }
        if(order[0] == nums[1])
        {
            order[1] = Math.min(nums[0],nums[2]) ;
            order[2] = Math.max(nums[0],nums[2]) ;
        }
        if(order[0] == nums[2])
        {
            order[1] = Math.min(nums[1],nums[0]) ;
            order[2] = Math.max(nums[1],nums[0]) ;
        }
        boolean printed = false;
        for (int[] n : new int[][]{order,nums})
        {
            for(int i = 0 ; i < 3 ; i++)
                System.out.printf("%d\n",n[i]);
            if(!printed)
            {
                System.out.println("");
                printed =true;
            }
        }
    }
    public static void main(String[] args) {
        new P1042();
    }
}
