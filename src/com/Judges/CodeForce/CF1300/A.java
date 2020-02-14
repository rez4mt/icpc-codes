package com.Judges.CodeForce.CF1300;

import java.util.HashSet;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            HashSet<Integer> zeros = new HashSet<>();
            int sum = 0 ;
            long prod = 1 ;
            for(int i = 0 ; i < N;i++)
            {
                list[i] = sc.nextInt();
                if(list[i] == 0)
                    zeros.add(i);
                else
                {
                    prod*= list[i];
                    sum += list[i];
                }
            }
            if(zeros.isEmpty())
            {
                if(sum!=0)
                    System.out.println(0);
                else
                {
                    System.out.println(1);
                }
            }else
            {
                int ans = zeros.size();
                if(sum+ans==0)
                    System.out.println(ans+1);
                else System.out.println(ans);
            }
        }
    }
}
