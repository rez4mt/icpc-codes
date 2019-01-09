package com.Judges.CodeForce.CF144;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        ArrayList<Integer> m = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            list[i] = sc.nextInt();
            m.add(i,list[i]);
        }
        Arrays.sort(list);
        int short_index = m.lastIndexOf(list[0]);
        int tall_index = m.indexOf(list[n-1]);
        int pos = tall_index + (n-1-short_index);
        System.out.println(tall_index>short_index?pos-1:pos);


    }
}

