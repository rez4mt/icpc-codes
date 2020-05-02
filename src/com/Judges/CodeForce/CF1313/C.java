package com.Judges.CodeForce.CF1313;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for(int i = 0 ; i < N ; i++)
            list[i ] = sc.nextInt();

        for(int i = 1 ; i < N ; i++)
        {
            if(list[i] > list[i-1])
            {
                int min = list[i] ;
                int count = 0 ;
                long diff = 0 ;
                for(int j = i-1 ; j >=0 ;j--)
                {
                    if(list[j] < min)
                    {
                        //min here..

                    }
                }
            }

        }
    }
}
