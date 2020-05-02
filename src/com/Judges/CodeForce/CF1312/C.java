package com.Judges.CodeForce.CF1312;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int k = sc.nextInt();
            long[] list = new long[N];
            for(int i = 0 ; i < N ; i++)
                list[i] = sc.nextLong();
            Arrays.sort(list);
            for(int i = 0 ; i < N ; i++)
            {
                if(list[i] == 0)
                    continue;
                //start dividing
                int p = 0 ;
                if(list[i]%k == 1 && list[i]!=1)
                {
                    
                }
                while(list[i]%k == 0)
                {
                    list[i]/=k;
                    p++;
                }

            }
        }
    }
}
