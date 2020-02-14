package com.Judges.UVA;


import java.util.HashSet;
import java.util.Scanner;


public class U11572{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = sc.nextInt();
            HashSet<Integer> chosen = new HashSet<>();
            int max = 0 ;
            for(int i = 0 , j =  0 ; i < N ; i++)
            {
                if(!chosen.contains(list[i]))
                {
                    chosen.add(list[i]);
                    max =  Math.max(chosen.size(), max);
                }else
                {
                    //contains .. move j until it is removed..

                    while (list[j]!=list[i])
                        chosen.remove(list[j++]);
                    j++;
                }
            }
            System.out.println(max);
        }
    }
}