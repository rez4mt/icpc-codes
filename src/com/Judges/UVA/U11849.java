package com.Judges.UVA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class U11849 {
    public static void main(String[] args) {
        HashSet<Integer> set;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0)
                break;
            int[] list = new int[n];
            for(int i = 0 ; i < n ;i++)
                list[i] = sc.nextInt();
            int idx =0  ;
            int count= 0;
            while(m-->0)
            {
                int tmp = sc.nextInt();
                if(idx<n)
                {
                    if(tmp == list[idx])
                    {
                        idx++;
                        count++;
                    }else if(tmp>list[idx])
                    {
                        while (idx<n && list[idx]<tmp)
                            idx++;
                        if(idx<n && list[idx]==tmp)
                        {
                            count++;
                            idx++;
                        }
                    }
                }

            }
            System.out.println(count);
        }

    }
}
