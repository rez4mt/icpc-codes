package com.Judges.UVA;
import java.util.*;
public class U10050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int[] ps = new int[p];
            for(int i = 0 ; i <p ; i++)
                ps[i] = sc.nextInt();
            boolean[] hartals = new boolean[n+1];
            for(int i = 0 ; i < p ; i++)
            {
                for(int ni = ps[i] ; ni <= n ;ni+=ps[i])
                {
                    hartals[ni] = true;
                }
            }
            int cnt = 0 ;
            for(int i = 0 ; i <= n ;i++)
            {
                if(i%7==0 || i%7==6)
                    continue;
                cnt+= hartals[i]?1:0;
            }
            System.out.println(cnt);
        }
    }
}
