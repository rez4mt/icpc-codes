package com.Judges.CodeForce.CF1288;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N , D;
            N = sc.nextInt();
            D = sc.nextInt();
            boolean flag = D <= N;
            int best = Integer.MAX_VALUE;
            for(int i = 1 ; i <= N ; i++)
            {
                int current = i + (int)Math.ceil(D/(i+1d));
                if(current>best)
                {
                    flag = false;
                    break;
                }
                if(current<=N)
                {
                    flag = true;
                    break;
                }
                best = current;

            }

            if(flag)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
