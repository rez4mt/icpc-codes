package com.Judges.UVA;

import java.util.Scanner;

public class U414 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = Integer.parseInt(sc.nextLine());
            if(N == 0)
                break;
            int[] counts = new int[N];
            int frame = 0 ;
            for(int i = 0 ; i < N ;i++)
            {
                String l = sc.nextLine();
                for(int j = 0 ; j < 25 ; j++)
                {
                    if(l.charAt(j) == 'X')
                        counts[i]++;
                }
                frame = Math.max(counts[i],frame);
            }
            int diff = 0 ;
            for(int i = 0 ; i < N ;i++)
            {
                diff += frame - counts[i];
            }
            System.out.println(diff);
        }
    }
}
