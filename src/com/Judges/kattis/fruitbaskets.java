package com.Judges.kattis;

import java.util.*;

public class fruitbaskets {
    static int[] list;
    static int N;
    static boolean[] used ;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        used = new boolean[N];
        list = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        System.out.println(bt(0));
    }
    static int bt(int idx)
    {
        int ans = 0;
        for(int i = idx+1 ; i < N  ;i++)
        {
            if(!used[i])
            {
                used[i] = true;
                ans += list[i]+bt(i);
                used[i] = false;
            }
        }
        /*if(ans<200)
            return 0;*/
       return ans;
    }
}
