package com.Judges.CodeForce. CF1345;

import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();;
        int lim = 81650 + 100;
        long[] list = new long[lim];
        list[1] = 2;
        for(int i =2 ; i< lim ; i++)
        {
            list[i] = list[i-1]*2;
            list[i] += 3;
            list[i] -= list[i-2];
        }


        while (T-->0)
        {
            int n = sc.nextInt();
            int count = 0;
            for(int i = lim-1 ; i >=1 ; i--)
            {
                if(list[i]<=n)
                {
                    count+= n / list[i];
                    n =(int)( n%list[i]);
                    if(n<=1)
                        break;
                }
            }
            System.out.println(count);
        }
    }
}
