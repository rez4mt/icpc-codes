package com.Judges.UVA;

import java.util.HashMap;
import java.util.Scanner;

public class U357 {
    static int[] coins = {1,5,10,25,50};
    static HashMap<MPair,Long> map;
    static int MAX = 300000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new HashMap<>();
        for(int i = 1 ; i < MAX;i++)
            calculate(coins.length-1,i);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            long way = calculate(coins.length-1,n);
            if(way == 1)
            {
                System.out.printf("There is only 1 way to produce %d cents change.\n",n);
            }else
            {
                System.out.printf("There are %d ways to produce %d cents change.\n",way,n);
            }
        }
    }
    private static long calculate(int type,int n)
    {
        MPair k = new MPair(type,n);
        if(map.containsKey(k))
            return map.get(k);
        if(n<0)
        {
            return 0;
        }
        else if(n == 0)
        {
            return 1;
        }
        if(type == 0)
        {

            return 1;
        }
        else
        {
            long c1 = calculate(type-1,n);
            long c2 = calculate(type,n-coins[type]);
            map.put(new MPair(type-1,n),c1);
            map.put(new MPair(type,n-coins[type]),c2);
            return c1+c2;
        }
    }
    static class MPair{
        int t,n;
        public MPair(int t,int n)
        {
            this.t = t;
            this.n = n;
        }

        @Override
        public boolean equals(Object obj) {
            MPair o = (MPair)obj;
            return t == o.t && n == o.n;
        }

        @Override
        public int hashCode() {
            return t+n;
        }
    }
}
