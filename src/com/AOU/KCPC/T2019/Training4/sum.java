//package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("pair.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            boolean flag = false;
            int N = sc.nextInt();
            int K = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i < N ; i++)
                set.add(sc.nextInt());
            for (int v :
                    set) {
                if(set.contains(K - v) && K - v!=v)
                {
                    flag = true;
                    System.out.println("YES");
                    break;
                }
            }
            if(!flag)
            System.out.println("NO");
        }
    }
}
