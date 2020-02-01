package com.Judges.CodeForce.CF1285;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            long sum = 0 ;
            for(int i = 0 ; i < N ; i++)
            {
                list[i] = sc.nextInt();
                sum+=list[i];
            }
            long max = Long.MIN_VALUE, current = 0;

            for (int i = 1; i < N; i++)
            {
                current = current+ list[i];
                if (max < current)
                    max = current;
                if (current < 0)
                    current = 0;
            }
            long last_max = max;
            max = Long.MIN_VALUE;
            current = 0;
            for (int i = 0; i < N-1; i++)
            {
                current = current+ list[i];
                if (max < current)
                    max = current;
                if (current < 0)
                    current = 0;
            }
            System.out.println(sum>last_max && sum>max?"YES":"NO");
        }
    }



}
