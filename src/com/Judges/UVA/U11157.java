package com.Judges.UVA;

import java.util.Scanner;
import java.util.StringTokenizer;

public class U11157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int C = 1;
        while (T-->0)
        {
            int N = sc.nextInt();
            int D = sc.nextInt();
            boolean[] isBig = new boolean[N+3];
            int[] pos = new int[N+3];
            boolean[] usable = new boolean[N+3];
            for(int i = 0 ; i < N ; i++)
            {
                StringTokenizer st = new StringTokenizer(sc.next(),"-");
                isBig[i] = st.nextToken().charAt(0) == 'B';
                pos[i] = Integer.valueOf(st.nextToken());
                usable[i] = true;
            }
            pos[N] = D;
            isBig[N] = true;
            int min = pos[0];
            for(int i = 0 ; i < N ; i++)
            {
                usable[i] = false;
                if(isBig[i+1])
                {
                    min = Math.max(min , pos[i+1] - pos[i]);
                }else
                {
                    min = Math.max(min , pos[i+2] - pos[i]);
                    i++;
                }
            }
            for(int i = N ; i > 0 ;i--)
            {
                if(usable[i-1] || isBig[i-1])
                {
                    min = Math.max(min , pos[i] - pos[i-1]);
                }else
                {
                    if(i <= 1)
                    {
                        min = Math.max(min , pos[i]);
                        i--;
                        continue;
                    }
                    min = Math.max(min , pos[i] - pos[i-2]);
                    i--;
                }
            }
            System.out.printf("Case %d: %d\n",C++,min);

        }
    }
}
