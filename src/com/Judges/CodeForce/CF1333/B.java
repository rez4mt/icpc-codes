package com.Judges.CodeForce.CF1333;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int[] list = new int[n];
            int one = -1  ,  neg=-1 ;
            for(int i = 0 ; i < n ; i++)
            {
                list[i] = sc.nextInt();
                if(list[i] == 1 && one==-1)
                    one = i;
                if(list[i] == -1 && neg == -1)
                    neg = i;
            }
            int[] sec = new int[n];
            for(int i = 0 ; i < n ; i++)
                sec[i] = sc.nextInt();
            boolean flag = true;
            for(int i = 0 ; i < n ; i++)
            {
                if(list[i] < sec[i]  && (one >= i ||one==-1))
                {
                    flag = false;
                    break;
                }else if(list[i] > sec[i]  && (neg >=i ||neg==-1) )
                {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag?"YES":"NO");

        }
    }
}
