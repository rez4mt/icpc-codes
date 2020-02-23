package com.ICPC.CoachAcademy.Placement;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc .nextInt();
        while(T-->0)
        {
            int l = Integer.MIN_VALUE;
            for(int i = 0 ; i < 3 ;i++ )
                l = Math.max(l , sc.nextInt());
            System.out.println(l);
        }
    }
}
