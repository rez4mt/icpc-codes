//package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class tables {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("twotables.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int M = sc.nextInt();
            int N = sc.nextInt();
            SortedSet<Integer> set = new TreeSet<>();
            for(int i = 0 ; i < M ; i++)
                set.add(sc.nextInt());
            for(int i = 0 ; i < N ; i++)
                set.add(sc.nextInt());
            StringBuilder b = new StringBuilder();
            b.append(set.size()+"\n");
            for(int v:set)
                b.append(v+" ");
            b.deleteCharAt(b.length()-1);
            System.out.println(b.toString());

        }
    }
}
