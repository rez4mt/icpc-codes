package com.Judges.kattis;

import java.util.*;

public class fruitbaskets {
    static int[] list;
    static int N;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        list = new int[N];
        long sum = 0 ;
        for(int i = 0 ; i < N ; i++)
        {
            list[i] = sc.nextInt();
            sum += list[i];
        }
        sum = (long)(sum*Math.pow(2,N-1));
        Arrays.sort(list);

        System.out.println(sum-bt(0,0,0));

    }
    static int bt(int idx,int sum,int count)
    {
        if(idx == N || count == 4)
            if(sum > 200)
                return 0 ;
            else
                return sum;
        return bt(idx + 1 , sum + list[idx] , count + 1)
                + bt(idx + 1 , sum , count);
    }
}
