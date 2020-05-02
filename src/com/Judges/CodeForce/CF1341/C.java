package com.Judges.CodeForce.CF1341;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int[] list = new int[n];
            HashMap<Integer , Integer> pos = new HashMap<>();
            for(int i = 0 ; i < n ; i ++)
            {
                list[i] = sc.nextInt();
                pos.put(list[i] , i );
            }
            int current = 1;
            boolean[] visited = new boolean[n];
            boolean flag = true;
            while(current<n && flag)
            {
                for(int i = pos.get(current) ; i <n ; i++)
                {
                    visited[i] = true;
                    if(i == n-1 || visited[i+1])
                    {
                        current = list[i]+1;
                        if(list[i]!=n &&  pos.get(list[i]+1) > i)
                            flag = false;
                        break;
                    }
                    if(list[i]+1!=list[i+1])
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if(!flag)
                System.out.println("No");
            else System.out.println("Yes");

        }
    }
}
