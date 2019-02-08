package com.Judges.uri;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Integer[] list = new Integer[t];
        for(int i = 0 ; i < t ; i ++)
            list[i] = sc.nextInt();

        Arrays.sort(list,new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2) {
                boolean odd =  o1%2 == 0 && o2%2==0;
                boolean even = o1%2 == 1 && o2%2==1;
                if(odd)
                {
                    return  Integer.compare(o1,o2);
                }else if(even)
                {
                    return -1 * Integer.compare(o1,o2);
                }else
                {
                    if(o1 % 2 == 0 && o2%2==1)
                        return -1;
                    else if(o1 % 2 == 1 && o2 % 2 == 0)
                        return 1;
                }
                return 0;
            }
        });
        for(int i = 0 ; i < t ; i++)
        {
            System.out.println(list[i]);
        }
    }
}
