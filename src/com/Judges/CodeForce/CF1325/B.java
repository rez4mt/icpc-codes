package com.Judges.CodeForce.CF1325;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = sc.nextInt();
            Arrays.sort(list);
            int count = 1 ;
            int last = list[0] ;
            for(int i = 1 ; i< N ; i++){
                if(list[i]>last) {
                    last = list[i];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
