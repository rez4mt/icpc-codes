package com.Judges.UVA;

import java.util.Scanner;

public class U11264 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int[] vals = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                vals[i] = sc.nextInt();
            }
            long s = 0;
            int count = 1;
            for(int i = 0 ; i < n-1;i++)
            {
                if(s+vals[i] < vals[i+1])
                {
                    s+=vals[i];
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
