package com.Judges.CodeForce.CF285;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] list = new int[T];

        HashSet<Integer> set = new HashSet<>();
        int current = 1;

        for(int i = 0 ; i < T ; i ++)
        {
            list[i] = sc.nextInt();
            set.add(list[i]);
        }
        while (set.contains(current))
            current++;
        Arrays.sort(list);


    }
}
