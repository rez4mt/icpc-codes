package com.Judges.UVA;

import java.util.Scanner;

public class U1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            for(int i = 0 ; i < N ; i++)
            {
                list[i] = sc.nextInt();
            }
            int s = 0;
            for(int i = 1 ; i < N ; i++)
            {
                int c = 0;
                for(int j =0 ; j < i ; j++)
                {
                    if(list[j]<=list[i])
                        c++;
                }
                s += c;
            }
            System.out.println(s);
        }
    }
}
