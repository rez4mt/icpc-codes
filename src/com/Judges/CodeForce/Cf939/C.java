package com.Judges.CodeForce.Cf939;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n ; i ++)
            nums[i] = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();

        int r = f - s;
        int ans = 0;
        for(int i = s ; i < f ; i ++)
        {
            ans += nums[i];
        }
        int max = ans;
        int pos = 0;
        for(int i = 1 ; i < n ; i ++)
        {
            ans -= nums[(s - i + n) % n];
            ans += nums[(f - i + n) % n];
            if( ans > max )
            {
                max = ans;
                pos = i;
            }
        }

        System.out.println(pos+1);

    }

}
