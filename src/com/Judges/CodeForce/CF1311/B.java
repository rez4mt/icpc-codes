package com.Judges.CodeForce.CF1311;

import java.util.HashSet;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            HashSet<Integer> pors = new HashSet<>();
            int[] list = new int[n];
            for(int i = 0 ; i < n ; i++)
                list[i] = sc.nextInt();
            for(int i = 0 ; i < m ; i++)
                pors.add(sc.nextInt()-1);
            boolean flag = true;
            boolean sorted = false;
            int last_id = 0 ;
            while (!sorted)
            {
                for(int i = last_id ; i < n-1; i++)
                {
                    if(list[i]>list[i+1])
                    {
                        if(!pors.contains(i))
                        {
                            flag = false;
                            break;
                        }
                        int tmp = list[i];
                        list[i] = list[i+1];
                        list[i+1] = tmp;
                    }
                }
                if(!flag)
                    break;
                sorted = true;
                for(int i = 0 ; i < n-1 ; i++)
                {
                    if(list[i]>list[i+1])
                    {
                        last_id = i;
                        sorted =false;
                        break;
                    }
                }
            }
            if(flag)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}
