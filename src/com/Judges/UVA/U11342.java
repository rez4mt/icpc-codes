package com.Judges.UVA;

import java.util.*;

public class U11342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int sqrt = (int) Math.sqrt(N);
            boolean found = false;
            for(int i = 0 ; i <= sqrt && !found ;i++)
            {
                int i2 = i*i;
                for(int j = i ; j <=sqrt && !found;j++)
                {
                    int j2= j*j;
                    double sqrt2 = Math.sqrt(N-i2-j2);
                    if(i2+j2+(sqrt2*sqrt) == N)
                    {
                        System.out.printf("%d %d %d\n",i,j,sqrt);
                        found = true;
                    }
                }
            }
            if(!found)
                System.out.println(-1);
        }
    }
}
