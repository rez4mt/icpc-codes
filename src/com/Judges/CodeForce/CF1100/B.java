package com.Judges.CodeForce.CF1100;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        StringBuilder b = new StringBuilder();
        while (m-->0)
        {
            set.add(sc.nextInt());
            if(set.size() == n)
            {
                b.append("1");
                set.clear();
            }else
                b.append("0");
        }
        System.out.println(b);
    }
}
