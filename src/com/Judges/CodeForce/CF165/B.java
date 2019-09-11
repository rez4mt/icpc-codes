package com.Judges.CodeForce.CF165;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long ans = -1, lo = 1, hi = (long)1e10;
        while(lo <= hi)
        {
            long mid = lo + (hi-lo)/2;
            long kk = 1, sum = 0;
            while(mid/kk > 0)
            {
                sum += mid/kk;
                kk *= k;
            }
            if(sum >= n)
            {
                ans = mid;
                hi = mid - 1;
            }
            else
                lo = mid + 1;
        }
        System.out.println(ans);
    }
}
