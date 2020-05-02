package com.Judges.CodeForce.CF1324;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = sc.nextInt();
            boolean flag = true;
            for(int i = 0 ; i< N && flag ;i++)
            {
                for(int j = i+1 ; j<N;j++)
                {
                    if(Math.abs(list[i]-list[j])%2!=0)
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag)
            {
                System.out.println("YES");
            }else System.out.println("NO");
        }

    }
}
