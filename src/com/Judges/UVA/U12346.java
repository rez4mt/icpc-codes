package com.Judges.UVA;

import java.util.Scanner;

public class U12346 {
    static WaterGate[] wG;
    static int N ;
    static int INF = (int)10e9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        wG = new WaterGate[N];
        for(int i = 0 ; i < N ; i++)
            wG[i] = new WaterGate(sc.nextInt(),sc.nextInt());
        int M = sc.nextInt();
        for(int i = 1 ; i <= M ; i++)
        {
            long MIN = Long.MAX_VALUE;
            MIN = solve(0,sc.nextInt()/(double)sc.nextInt());
            if(MIN == INF)
                System.out.printf("Case %d: IMPOSSIBLE\n", i);
            else
                System.out.printf("Case %d: %d\n", i,MIN);

        }


    }
    static class WaterGate{
        int fr ,   cost ;
        public WaterGate(int fr , int cost)
        {
            this.fr = fr ;
            this.cost = cost;

        }
    }

    private static long solve( int current , double remaining )
    {
        if(current == N)
        {
            if( remaining <= 0 )
                return 0 ;
            return INF ;
        }
        return Math.min(solve(current+1,remaining),wG[current].cost+solve(current+1,remaining - wG[current].fr));
    }

}
