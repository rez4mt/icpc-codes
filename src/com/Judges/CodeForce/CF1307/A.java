package com.Judges.CodeForce.CF1307;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] list = new int[n];
            for(int i = 0 ; i < n  ; i++)
                list[i] = sc.nextInt();
            for(int i = 1 ; i < n ; i++)
            {
                if(list[i]!=0)
                {
                    while (d>=i && list[i]!=0)
                    {
                        list[i]--;
                        list[0]++;
                        d-=i;
                    }
                }
            }
            System.out.println(list[0]);
        }
    }
}
