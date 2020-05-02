package com.Judges.CodeForce.CF1335;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = 0; i < n; i++)
            {
                sb.append((char)('a'+(i%b)));
            }
            System.out.println(sb);
        }
    }
}
