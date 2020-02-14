package com.Judges.CodeForce.CF1272;
import java.util.Scanner;

public class A {
    static long[] nums;
    static int[] dx;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        dx = new int[]{-1,0,1};
        nums = new long[3];
        while (T-->0)
        {
            for(int i = 0 ; i < 3 ; i++)
                nums[i] = sc.nextLong();
            System.out.println(bf(0));
        }
    }
    static long bf(int idx)
    {
        if(idx == 3)
            return (long)Math.abs(nums[0] - nums[1]) + Math.abs(nums[0]-nums[2]) + Math.abs(nums[1]-nums[2]);

        long ans = Long.MAX_VALUE ;

        for(int j = 0 ; j  < 3 ; j++)
        {
            nums[idx] += dx[j];
            ans = Math.min(ans , bf(idx +1 ));
            nums[idx] -= dx[j];
        }
        return ans ;
    }
}