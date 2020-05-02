package com.Judges.CodeForce.CF1095;//package com.Judges.CodeForce.Contents.R529D3;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++)
        {
             nums.add(sc.nextInt());
        }

        Collections.sort(nums);
        if(n == 2)
        {
            System.out.println(0);
            return;
        }
        int first = nums.get(n-2) - nums.get(0);
        int second = nums.get(n-1) - nums.get(1);
        System.out.println(Math.min(first,second));
    }
}
