package com.Judges.UVA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class U11849 {
    public static void main(String[] args) {
        HashSet<Integer> set;
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        while(n !=0 && m!=0)
        {
            set = new HashSet<Integer>();
            for(int i = 0;i<n;i++)
            {
                set.add(sc.nextInt());
            }
            int count =0;
            for(int i = 0; i < m ;i++)
            {
                if(set.contains(sc.nextInt()))
                    count++;
            }
            System.out.println(count);
            n = sc.nextInt();
            m = sc.nextInt();
        }

    }
}
