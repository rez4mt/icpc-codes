package com.Judges.SPOJ;

import java.util.Arrays;
import java.util.Scanner;

public class ABSYS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] nums = new int[3];
        while (T-->0)
        {
            for(int i = 0 ; i < 3 ; i++)
            {
                String d = sc.next();
                if(d.contains("machula"))
                {
                    nums[i] = -1;
                }else nums[i] = Integer.valueOf(d);
                if(i != 2) sc.next();

            }
            if(nums[0] == -1)
            {
                nums[0] = nums[2] - nums[1];
            }else if(nums[1] == -1)
            {
                nums[1] = nums[2] - nums[0];
            }else if(nums[2] == -1)
            {
                nums[2] = nums[0] + nums[1];
            }
            System.out.printf("%d + %d = %d\n",nums[0],nums[1],nums[2]);
        }
    }
}
