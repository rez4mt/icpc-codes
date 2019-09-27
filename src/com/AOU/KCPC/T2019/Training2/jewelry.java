//package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class jewelry {
    public static void main(String[] args) throws Exception{
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("fractions.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int G = sc.nextInt();
            int M = sc.nextInt();
            Integer[] weights = new Integer[G];
            Integer[] days = new Integer[M];
            for(int i = 0 ; i < G ; i++)
                weights[i] = sc.nextInt();
            for(int i = 0 ; i < M ; i++)
                days[i] = sc.nextInt();
            Arrays.sort(weights,new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            Arrays.sort(days,new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            long sum = 0 ;
            for(int i = 0 ; i < Math.min(G,M) ; i ++)
                sum+=weights[i]*(long)days[i];
            System.out.println(sum);


        }
    }
}
