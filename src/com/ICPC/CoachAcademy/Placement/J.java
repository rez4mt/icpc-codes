package com.ICPC.CoachAcademy.Placement;

import java.util.Arrays;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[n];
        int[] list2 = new int[m];
        for(int i= 0; i < n;i++)
            list[i] = sc.nextInt();
        for(int i = 0 ; i < m ; i++)
            list2[i] = sc.nextInt();
        Arrays.sort(list);
        Arrays.sort(list2);
        long cnt = 0 ;
        int target = Math.min(list[n-1] , list2[0]);
        if(list2[m-1] < list[0])
        {
            System.out.println(0);
            return;
        }
        int gap = Math.max(list2[0]- list[n-1]  ,0) ;

        for(int i = 0 ; i < n ;i++)
        {
            if(list[i] < target)
                cnt+= target-list[i] + gap;
        }
        target = Math.max(list2[0] , list[n-1]);
        for(int i = 0 ; i < m ;i++)
        {
            if(list2[i] > target)
                cnt+=list2[i]- target;
        }
        System.out.println(cnt);

    }
}
