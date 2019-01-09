package com.Judges.UVA;

import java.util.Scanner;

public class U11577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str;
        sc.nextLine();
        int[] counts;
        int max ;
        for(int l = 0 ; l < a; l++)
        {
            max = -1;
            counts = new int[127];
            str = sc.nextLine().toLowerCase();
            for(int i = 0 ; i < str.length();i++)
            {
                if(counts.length>(int)str.charAt(i))
                {
                    counts[str.charAt(i)] ++;
                }
            }
            for(int i = 0 ; i< counts.length;i++)
            {
                if(i == 32)
                    continue;
                max = Math.max(max,counts[i]);
            }
            for(int i = 0 ; i< counts.length;i++)
            {
                if(counts[i] == max)
                    System.out.print((char)i);
            }
            System.out.println();
        }
    }
}
