package com.Judges.UVA;

import java.util.Scanner;

public class U10714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int L =  sc.nextInt();
            int N = sc.nextInt();
            if(N == 0)
            {
                System.out.println("0 0");
                continue;
            }
            int min = 0;int max = 0;

            for(int i = 0 ; i < N ; i++)
            {
                int cur = sc.nextInt();
                min = Math.max(min, Math.min(cur, L - cur));
                max = Math.max(max, Math.max(cur, L - cur));
            }
            System.out.println(min +" "+max);

        }
    }
}
